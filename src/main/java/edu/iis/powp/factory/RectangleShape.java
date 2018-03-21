package edu.iis.powp.factory;

import java.util.LinkedList;

import edu.iis.powp.command.CommandDrawLineToPosition;
import edu.iis.powp.command.CommandSetPosition;
import edu.iis.powp.command.ComplexCommand;
import edu.iis.powp.command.PlotterCommand;

public class RectangleShape {	
	
	private LinkedList<PlotterCommand> plotterCommandsList;
	private int x0 = 0, y0 = 0, xlength = 0, ylength = 0;
	
	
	public RectangleShape(int x0, int y0, int xlength, int ylength) {
		plotterCommandsList = new LinkedList<>();
		this.x0 = x0 - xlength/2;
		this.y0 = y0 - ylength/2;
		this.xlength = xlength;
		this.ylength = ylength;
	}
	
	public ComplexCommand getShape() {
		createRectangle();		
		return new ComplexCommand(plotterCommandsList);
	}

	private void createRectangle() {
		
		plotterCommandsList.add(new CommandSetPosition(x0, y0));
		plotterCommandsList.add(new CommandDrawLineToPosition(x0 + xlength, y0));
		plotterCommandsList.add(new CommandDrawLineToPosition(x0 + xlength, y0 + ylength));
		plotterCommandsList.add(new CommandDrawLineToPosition(x0, y0 + ylength));
		plotterCommandsList.add(new CommandDrawLineToPosition(x0, y0));
	}
	
}
