package com.example.remya.demoH2;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class DemoH2Entity {
	public DemoH2Entity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	private int id ;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public DemoH2Entity(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	private String name;

}
