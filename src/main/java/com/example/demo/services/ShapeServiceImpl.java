package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.enties.Shape;
import com.example.demo.repository.ShapeRepository;

@Service
public class ShapeServiceImpl implements ShapeService {

	@Autowired
	private ShapeRepository shapeRepository;
	
	
	
	public ShapeServiceImpl() {
		
	}
	
	@Override
	public List<Shape> getShapes() {
		
		return shapeRepository.findAll();
	}
	@Override
	public Shape addShape(Shape shape) {
		shapeRepository.save(shape);	
		return shape;
	}
	
	

}
