package org.mql.models;

import java.io.Serializable;

public class Document implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String title;
	private double price;
	
	public Document() {
	}

	public Document(int id, String title, double price) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString() {
		return "Document [id=" + id + ", title=" + title + ", price=" + price + "]";
	}
}
