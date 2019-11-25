package org.mql.server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import org.mql.business.DocumentService;
import org.mql.business.DocumentServiceDefault;

public class Server {

	public static void main(String[] args) {

		try {
			LocateRegistry.createRegistry(1099);
			DocumentService documentService = new DocumentServiceDefault();
			Naming.rebind("documentService", documentService);
		} 
		catch (Exception e) {
			System.out.println("Erreur :" + e.getMessage());
		}

		System.out.println("Serveur est démarré ");
	}
}
