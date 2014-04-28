package com.factory;

import com.factory.objects.Circle;
import com.factory.objects.Rectangle;
import com.factory.objects.Shape;

public class ShapeFactory {
	
	public Shape getShape(String type){
		
		if(type=="CIRCLE"){
			return (Shape)new Circle();
		}
		
		if(type=="RECTANGLE"){
			return (Shape)new Rectangle();
		}
		
		return null;
	}

}
