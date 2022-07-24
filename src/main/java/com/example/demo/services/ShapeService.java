package com.example.demo.services;

import java.util.List;

import com.example.demo.enties.Shape;

public interface ShapeService {

	public List<Shape> getShapes();

	public Shape addShape(Shape shape);
	
	
}
