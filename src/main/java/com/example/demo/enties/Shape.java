package com.example.demo.enties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Shape {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String type;
	
	private int x1;
	private int y1;
	
	private int x2;
	private int y2;	

	public Shape() {
		super();
	}
	

	public Shape(long id, String type, int x1, int x2, int y1, int y2) {
		super();
		this.id = id;
		this.type = type;
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2; 
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}
	
	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}	

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	@Override
	public String toString() {
		return "Shape [id=" + id + ", type=" + type + ", x1=" + x1 + ", x2=" + x2 + ", y1=" + y1 + ", y2=" + y2 + "]";
	}

	
	
	
	
}
