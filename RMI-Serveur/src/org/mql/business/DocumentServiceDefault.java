package org.mql.business;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import org.mql.models.Document;

public class DocumentServiceDefault extends UnicastRemoteObject implements DocumentService{
	private static final long serialVersionUID = 1L;
	private List<Document> documents;
	
	public DocumentServiceDefault() throws RemoteException {
		documents = new Vector<>();
		
		documents.add(new Document(101, "Parseurs XML", 654));
		documents.add(new Document(102, "Ingénierie de l'objet en Java", 800));
		documents.add(new Document(103, "Ingénierie du web avec JavaScript", 120));
	}

	public Document get(int id) throws RemoteException {
		for (int i = 0; i < documents.size(); i++) {
			if (id == documents.get(i).getId()) 
				return documents.get(i);
			}
		return null;
	}
}
