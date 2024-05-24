package com.mkpits.collectionframework;

public class ModalOrBeanClass {

	int id;
	String name;
	
	
	public ModalOrBeanClass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public ModalOrBeanClass() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "ModalOrBeanClass [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
	
	
	
}
