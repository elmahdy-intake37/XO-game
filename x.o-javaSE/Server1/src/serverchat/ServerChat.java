/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverchat;

import ImplS.ServerImpl;
import database.Database;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hager
 */
public class ServerChat {
	

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new ServerChat();
    }
    public ServerChat()
    {
        try {
            ServerImpl obj = new ServerImpl();
            Registry reg = LocateRegistry.createRegistry(5000);
            reg.rebind("ChatService", obj);
            System.out.println("Server is running ");
            
        } catch (RemoteException ex) {
            Logger.getLogger(ServerChat.class.getName()).log(Level.SEVERE, null, ex);
        }
       /*    startserver();
       stopserver();  */
    }
    public void startserver()
    {
        try {
            ServerImpl obj = new ServerImpl();
            Registry reg = LocateRegistry.createRegistry(5000);
            reg.rebind("Chat Service", obj);  
        } catch (RemoteException ex) {
            Logger.getLogger(ServerChat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void stopserver() throws NotBoundException
    {
        try {
            ServerImpl obj = new ServerImpl();
            Registry reg = LocateRegistry.createRegistry(5000);
           /* String servicename="Chat Service";
            Naming.unbind(servicename);
            UnicastRemoteObject.unexportObject((Remote) this, true);
            
            System.out.println("Server exiting.");*/
        } catch (RemoteException ex) {
            Logger.getLogger(ServerChat.class.getName()).log(Level.SEVERE, null, ex);
        } 
             
    }
    
}
