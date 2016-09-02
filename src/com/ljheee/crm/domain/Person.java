package com.ljheee.crm.domain;

import java.util.ArrayList;

/**
 * POJO
 * @author ljheee
 *
 */
public class Person {

	private long id;
	private String name;
	private int age;
	private ArrayList<String> phones;
	
	public Person() {
	}
	

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public ArrayList<String> getPhones() {
		return phones;
	}


	public void setPhones(ArrayList<String> phones) {
		this.phones = phones;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void addNewPhone(String phone){
		phones.add(phone);
	}

	
}
