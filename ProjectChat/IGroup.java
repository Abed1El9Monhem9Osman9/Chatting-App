/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectChat;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author abed_
 */
public interface IGroup extends Remote{
 
    public void sendToAll(String msg, IServer server) throws RemoteException;
    
    public void addClient(String id, IServer server) throws RemoteException;
    
    public void removeClient(String id) throws RemoteException;
    
    public String getAllClients() throws RemoteException;
}