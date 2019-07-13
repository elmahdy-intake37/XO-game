/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImplS;

import InterfaceC.ClientInt;
import InterfaceS.ServerInt;
import database.Database;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hager
 */
public class ServerImpl extends UnicastRemoteObject implements ServerInt {
private Database db;//intialize in constructor//getter in interface
	Vector<ClientInt> clientsVector = new Vector<ClientInt>();
	int[] arr = {-1, -1, -1, -1, -1, -1, -1, -1, -1};
 	int con = 0;
	private int count = 1;
	private String letter ;

	public ServerImpl() throws RemoteException {
		// count = 0;
	}
	

	@Override
	public void tellOthers(int [] msg,int pos)  {
		// System.out.println("Message Received:"+msg);
		System.out.println("here");
		for (ClientInt CRef : clientsVector) {
			
			try {
				CRef.receive( msg , pos);
			} catch (RemoteException ex) {
				Logger.getLogger(ServerImpl.class.getName()).log(Level.SEVERE, null, ex);
			}
			

		}
	}

	@Override
	public void register(ClientInt CRef) throws RemoteException {
		clientsVector.add(CRef);
		System.out.println("Added");
	}

	@Override
	public void unRegister(ClientInt CRef) throws RemoteException {
		clientsVector.remove(CRef);
		System.out.println("Removed");
	}

	//////////////////////////////////
	@Override
	public void setCount(int x) {
		
		this.count = x;
	}

	@Override
	public int getCount() {
		return count;
	}

	@Override
	public void setLetter(int count) {

		if (count == 1 || count == 3 || count == 5 || count == 7 || count == 9) {
			letter = "X";
			this.letter = "X";
			setCount(++count);
			
		} else if (count == 2 || count == 4 || count == 6 || count == 8) {
			letter = "O";
			this.letter = "O";
			setCount(++count);
			
		}

	}

	@Override
	public String getLetter() {
		return letter;
	}

	@Override
	public void setArr(int x, int pos) {
		this.arr[pos] = x;

	}

	@Override
	public int[] getArr() {
		return (arr);
	}
	

}
