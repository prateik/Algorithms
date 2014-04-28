package com.factory;

import com.factory.objects.Circle;
import com.factory.objects.Shape;

public class Driver {

	
	
	public static void main(String args[]){
		ShapeFactory shape_factory = new ShapeFactory();
		
		
		Shape shape = shape_factory.getShape("CIRCLE");
		shape.draw();
		shape = shape_factory.getShape("RECTANGLE");
	    shape.draw();
	    
	    Circle c= (Circle)shape;
	    c.draw();
	}
}
