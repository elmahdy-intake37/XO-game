/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




import java.io.IOException;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import InterfaceC.ClientInt;

/**
 *
 * @author salma
 */
public class ClientImpl extends UnicastRemoteObject implements ClientInt {

	DiffrentController con;

	public ClientImpl() throws RemoteException {

	}

	public void setCon(DiffrentController con) {
		this.con = con;
	}

	@Override
	public void receive(int[] msg, int pos) throws RemoteException {
            try {
                con.display(msg,pos);
//		try {
//			
//			//
//		} catch (IOException ex) {
//			Logger.getLogger(ClientImpl.class.getName()).log(Level.SEVERE, null, ex);
//		}
            } catch (IOException ex) {
                Logger.getLogger(ClientImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
	}

}
