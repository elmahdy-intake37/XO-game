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

    public void unregister(ClientInt obj);
    public void setCount(int x);
    public int getCount();
   public void setLetter(int x);
     public String getLetter() ;
      public void setArr(int x , int pos) ;
    public int [] getArr();
}
