package org.mql.client;

import java.rmi.Naming;

import org.mql.business.DocumentService;
import org.mql.models.Document;

public class Client {

	public static void main(String[] args) {
		
		try {

			DocumentService documentService = (DocumentService) Naming.lookup("rmi://localhost:1099/documentService");

			Document document = documentService.get(102);

			System.out.println(document);

			} catch (Exception e) {
				System.out.println("erreur :" + e.getMessage());
			}

	}
}
