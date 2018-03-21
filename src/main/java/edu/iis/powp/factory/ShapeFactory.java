package edu.iis.powp.factory;

import edu.iis.powp.command.ComplexCommand;

public class ShapeFactory {
	
	
	public ComplexCommand getCircle() {	
	
		CircleShape circle = new CircleShape(0,0,150);
		return circle.getShape();
	}
	
	public ComplexCommand getRectangle() {
		
		RectangleShape rectangle = new RectangleShape(0,0,300,200);
		return rectangle.getShape();		
	}
}
