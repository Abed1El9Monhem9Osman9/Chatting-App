/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectChat;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import javax.swing.JCheckBox;

/**
 *
 * @author abed_
 */
public interface IServer extends Remote {

    public void reconnect(String id, IClient client) throws RemoteException;

    public void disconnect(String id) throws RemoteException;

    public void send(String msg, String id) throws RemoteException;

    public String listConnected() throws RemoteException;

    //
    public void subscribe(String id, Boolean b) throws RemoteException;

    public void createGroup(String idGroup, String idAdmin, IGroup grp) throws RemoteException;

    public boolean removeGroup(String idGroup, String idAdmin) throws RemoteException;
    
    public void sendToGroup(String idGroup, String msg) throws RemoteException;

    public void broadcast(String msg) throws RemoteException;

    public String getAllClients() throws RemoteException;
    
    public String getListGrp() throws RemoteException;
    
    public HashMap<String, IClient> getListClients() throws RemoteException;
    
    public HashMap<String, Boolean> getSubscribeMap() throws RemoteException;
    
    public HashMap<String, String> getOffLineMsg() throws RemoteException ;
    
    public void setOffLineMsg(HashMap<String, String> offLineMsg) throws RemoteException ;
//    public Collection<IClient> getListClients() throws RemoteException;
}
