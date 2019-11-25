package org.mql.business;

import java.rmi.Remote;
import java.rmi.RemoteException;

import org.mql.models.Document;

public interface DocumentService extends Remote{
	public Document get(int id) throws RemoteException; 
}
