package edu.iis.powp.factories;

import java.util.ArrayList;

import edu.iis.powp.command.*;

public class RectangleFactory {
	
	private static ArrayList<PlotterCommand> plotterCommands = new ArrayList<>();
	public  static ComplexCommand createRectangle (int startPositionX, int startPositionY, int width, int height) {
		plotterCommands.add(new CommandSetPosition(startPositionX,startPositionY));
        plotterCommands.add(new CommandDrawLineToPosition(startPositionX+width,startPositionY));
        plotterCommands.add(new CommandDrawLineToPosition(startPositionX+width,startPositionY+height));
        plotterCommands.add(new CommandDrawLineToPosition(startPositionX,startPositionY+height));
        plotterCommands.add(new CommandDrawLineToPosition(startPositionX,startPositionY));
		return new ComplexCommand(plotterCommands);				
	}
}
