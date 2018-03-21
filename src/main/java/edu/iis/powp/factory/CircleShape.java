package edu.iis.powp.factory;

import java.util.LinkedList;

import edu.iis.powp.command.CommandDrawLineToPosition;
import edu.iis.powp.command.CommandSetPosition;
import edu.iis.powp.command.ComplexCommand;
import edu.iis.powp.command.PlotterCommand;

public class CircleShape {
	
	private LinkedList<PlotterCommand> plotterCommandsList;	
	private int x0 = 0, y0 = 0, radius = 0;

	public CircleShape(int x0, int y0, int radius) {
		plotterCommandsList = new LinkedList<>();
		this.x0 = x0;
		this.y0 = y0;
		this.radius = radius;
	}
	
	public ComplexCommand getShape() {
		createCircle();
		return new ComplexCommand(plotterCommandsList);
	}

	private void createCircle() {
		
		plotterCommandsList.add(new CommandSetPosition(
				(int) Math.round( Math.sin( x0 * Math.PI/180 ) * radius ), 
				(int) Math.round( Math.cos( y0 * Math.PI/180 ) * radius ) 
		));
		
		for (int degree = 0; degree <= 360; degree+=2) {
			int dx = (int) Math.round( Math.sin( degree * Math.PI/180 ) * radius );
			int dy = (int) Math.round( Math.cos( degree * Math.PI/180 ) * radius );
			
			plotterCommandsList.add(new CommandDrawLineToPosition(dx, dy));			
		}	
	}
}
