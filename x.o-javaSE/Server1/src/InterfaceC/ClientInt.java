/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceC;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author hager
 */
public interface ClientInt extends Remote {
    void receive (int [] msg,int pos)throws RemoteException;
    
}
