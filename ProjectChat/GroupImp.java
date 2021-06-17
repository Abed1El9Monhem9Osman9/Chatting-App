/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectChat;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 *
 * @author abed_
 */
public class GroupImp extends UnicastRemoteObject implements IGroup {

    HashMap<String, IClient> listClients = new HashMap();

    String idGroup;

    public GroupImp(String idGroup, String idAdmin, IServer server) throws RemoteException {
        this.idGroup = idGroup;
        addClient(idAdmin, server);
    }

    @Override
    public void sendToAll(String msg, IServer server) throws RemoteException {
        Set<String> s = listClients.keySet();

        for (String st : s) {
            // online
            if (server.listConnected().contains(st)) {
                IClient cl = listClients.get(st);
                cl.notifier(msg);
                System.out.println("sendToAll " + st);
            } else {
            //client offline
                try {
                    System.out.println(st+"\n"+server.getSubscribeMap().toString());
                    HashMap<String, String> ls = server.getOffLineMsg();
                    if (server.getSubscribeMap().get(st)) {

                        String oldmsg = ls.get(st);
                        if (oldmsg == null) {
                            oldmsg = "";
                        }
                        oldmsg += "\n" + msg;
                        ls.put(st, oldmsg);
                        server.setOffLineMsg(ls);
                        System.out.println("put " + st);
                        System.out.println(ls.toString());
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        /* 2nd way*/
//        Collection<IClient> clients= listClients.values();
//        for(IClient cl : clients){
//            cl.notifier(msg);
//            System.out.println("sendToAll " + msg);
//        }
    }

    @Override
    public void addClient(String id, IServer server) throws RemoteException {
        HashMap<String, IClient> ls = server.getListClients();
//        if (server.getAllClients().contains(id)) { 
        // we shd add the same client registered in the server
        if (ls.containsKey(id)) {
            listClients.put(id, ls.get(id));////////////////////////////////////
        }
    }

    @Override
    public void removeClient(String id) throws RemoteException {
        if (listClients.containsKey(id)) {
            listClients.remove(id);
        }
    }

    @Override
    public String getAllClients() throws RemoteException {
        return listClients.keySet().toString();
    }

}
