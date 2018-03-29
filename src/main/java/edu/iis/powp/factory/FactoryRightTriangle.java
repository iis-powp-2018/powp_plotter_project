package edu.iis.powp.factory;

import java.util.ArrayList;
import edu.iis.powp.command.*;


public class FactoryRightTriangle {
	private static ArrayList<PlotterCommand> plotterCommands = new ArrayList<>();
	
	public static ComplexCommand createRectangle (int startx, int starty, int legA, int legB) {
		
		plotterCommands.add(new CommandSetPosition(startx,starty));
        plotterCommands.add(new CommandDrawLineToPosition(startx+legA,starty));
        plotterCommands.add(new CommandDrawLineToPosition(startx,starty-legB));
        plotterCommands.add(new CommandDrawLineToPosition(startx,starty));
        
        return new ComplexCommand(plotterCommands); 
	}
}
