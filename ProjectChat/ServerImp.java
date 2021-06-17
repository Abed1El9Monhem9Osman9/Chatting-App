/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectChat;

import java.awt.Checkbox;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import javax.swing.JCheckBox;

/**
 *
 * @author abed_
 */
public class ServerImp extends UnicastRemoteObject implements IServer {

    HashMap<String, IClient> listConnected = new HashMap();                     //idClient, Client
    HashMap<String, String> offLineMsg = new HashMap();//msg, idClient
    HashMap<String, Boolean> subscribeMap = new HashMap();//idClient, bool

    HashMap<String, IGroup> listGrp = new HashMap();                            //idGrp, idClient
    HashMap<String, IClient> listClients = new HashMap();
    HashMap<String, String> listGrpAdmin = new HashMap();

    public ServerImp() throws RemoteException {
    }

    public void setOffLineMsg(HashMap<String, String> offLineMsg) throws RemoteException {
        this.offLineMsg = offLineMsg;
    }

    public HashMap<String, String> getOffLineMsg() throws RemoteException {
        return offLineMsg;
    }

    public HashMap<String, Boolean> getSubscribeMap() throws RemoteException {
        return subscribeMap;
    }

    public HashMap<String, IClient> getListClients() throws RemoteException {
        return listClients;
    }

    @Override
    public void reconnect(String id, IClient client) throws RemoteException {
        listClients.put(id, client);
        listConnected.put(id, client);
        subscribeMap.put(id, false);

        System.out.println("connect " + id);
        String msg = offLineMsg.get(id);
        if (msg != null) {
            client.notifier(msg);
            offLineMsg.put(id, null);
        }
    }

    @Override
    public void disconnect(String id) throws RemoteException {
        listConnected.remove(id);
    }

    @Override
    public void send(String msg, String id) throws RemoteException {
        IClient cl = listConnected.get(id);
        if (cl != null) {
            // client online
            cl.notifier(msg);
            System.out.println("send " + id);
        } else {
            //client offline
            if (subscribeMap.get(id)) {

                String oldmsg = offLineMsg.get(id);
                if (oldmsg == null) {
                    oldmsg = "";
                }
                oldmsg += "\n" + msg;
                offLineMsg.put(id, oldmsg);
                System.out.println("put " + id);
            }
        }
    }

    @Override
    public String listConnected() throws RemoteException {
        return listConnected.keySet().toString();
    }

    @Override
    public void subscribe(String id, Boolean b) throws RemoteException {
        if (subscribeMap.containsKey(id)) {
            subscribeMap.replace(id, b);
        } else {
            subscribeMap.put(id, b);
        }
    }

    @Override
    public void createGroup(String idGroup, String idAdmin, IGroup grp) throws RemoteException {
//        if(listGrp.containsKey(idGroup)){
//            System.out.println("id already esxist");
//            return;
//        }
        listGrp.put(idGroup, grp);
        listGrpAdmin.put(idGroup, idAdmin);
    }

    @Override
    public void sendToGroup(String idGroup, String msg) throws RemoteException {
        System.out.println("sendToGroup: " + subscribeMap.toString());
        if (listGrp.containsKey(idGroup)) {
            IGroup grp = listGrp.get(idGroup);
            grp.sendToAll(msg.trim(), this);
            System.out.println("sendToGroup: " + offLineMsg.toString());
        } else {
            System.out.println("sendToGroup: listGrp doesn't contains this id");
        }
    }

    @Override
    public void broadcast(String msg) throws RemoteException {
//        Collection<IClient> clients = listClients.values();
//        for (IClient cl : clients) {
//            cl.notifier(msg);
//            System.out.println("broadcast " + msg);
//        }
        Set<String> s = listClients.keySet();

        for (String st : s) {
            if (listConnected().contains(st)) {
                IClient cl = listClients.get(st);
                cl.notifier(msg);
                System.out.println("broadcast " + st);
            } else {
                //client offline
                try {
                    System.out.println(st + "\n" + getSubscribeMap().toString());
                    HashMap<String, String> ls = getOffLineMsg();
                    if (getSubscribeMap().get(st)) {

                        String oldmsg = ls.get(st);
                        if (oldmsg == null) {
                            oldmsg = "";
                        }
                        oldmsg += "\n" + msg;
                        ls.put(st, oldmsg);
                        setOffLineMsg(ls);
                        System.out.println("put " + st);
                        System.out.println(ls.toString());
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    @Override
    public String getAllClients() throws RemoteException {
        return listClients.keySet().toString();
    }

    @Override
    public String getListGrp() throws RemoteException {
        return listGrp.keySet().toString();
    }

//    public Collection<IClient> getListClients() throws RemoteException{
//        return listClients.values();
//    }

    @Override
    public boolean removeGroup(String idGroup, String idAdmin) throws RemoteException {
        if(idAdmin.equals(listGrpAdmin.get(idGroup))){
            listGrp.remove(idGroup);
            return true;
        }
        return false;
    }
}
