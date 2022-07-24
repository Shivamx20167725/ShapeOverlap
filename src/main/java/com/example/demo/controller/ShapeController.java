package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.enties.Shape;
import com.example.demo.services.ShapeService;

@RestController
public class ShapeController {

	@Autowired
	private ShapeService shapeService;

	//To get all valid shapes stored in DB
	@GetMapping("/getShapes")
	public List<Shape> getShapes(){

		return this.shapeService.getShapes();
	}
	//To add only valid shapes. For overlapping shapes method will return NOT_ACCEPTABLE message
	@PostMapping("/addShape")
	public ResponseEntity<Shape> addShape(@RequestBody Shape shape){
		if(getShapes().isEmpty() || (getShapes().size()==0)) {
			return new ResponseEntity<>(this.shapeService.addShape(shape),HttpStatus.ACCEPTED);
		}
		else {

			int x1=shape.getX1();
			int y1=shape.getY1();
			int x2=shape.getX2();	
			int y2=shape.getY2();	

			boolean flag = true;

			List<Shape> shapes = getShapes();

			for(Shape square : shapes) {

				int px1=square.getX1();
				int py1=square.getY1();
				int px2=square.getX2();		
				int py2=square.getY2();				

				System.out.println(px1+" "+py1+ " "+px2+ " "+py2);

				if(!( x1<px2 && px1<x2 && y1<px2 && py1<y2)) {
					flag = false;
				}

			}
			
			if(flag) {
				return new ResponseEntity<>(this.shapeService.addShape(shape),HttpStatus.ACCEPTED);
			}

		}
		return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
	}

}