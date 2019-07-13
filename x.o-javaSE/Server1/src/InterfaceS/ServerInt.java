/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceS;

import InterfaceC.ClientInt;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author hager
 */
public interface ServerInt extends Remote {
    
    void tellOthers(int [] msg,int pos) throws RemoteException;
    void register (ClientInt CRef)throws RemoteException;
    void unRegister (ClientInt CRef)throws RemoteException;
    public void setCount(int x) throws RemoteException;
     public int getCount() throws RemoteException;
    public void setLetter(int x) throws RemoteException;
     public String getLetter() throws RemoteException;
     public void setArr(int x , int pos) throws RemoteException ;
    public int [] getArr() throws  RemoteException;
     
}
/*on button handler method

server: drawAll(String letter,int pos){
for each on vector
method at client:recive(letter ,post)
}

*/
