package edu.iis.powp.factories;

import java.util.ArrayList;

import edu.iis.powp.command.CommandDrawLineToPosition;
import edu.iis.powp.command.CommandSetPosition;
import edu.iis.powp.command.ComplexCommand;
import edu.iis.powp.command.PlotterCommand;

public class RightTriangleFactory {
	
	private static ArrayList<PlotterCommand> plotterCommands = new ArrayList<>();
	public static ComplexCommand createRectangle (int startPositionX, int startPositionY, int legA, int legB) {
		plotterCommands.add(new CommandSetPosition(startPositionX,startPositionY));
        plotterCommands.add(new CommandDrawLineToPosition(startPositionX+legA,startPositionY));
        plotterCommands.add(new CommandDrawLineToPosition(startPositionX,startPositionY-legB));
        plotterCommands.add(new CommandDrawLineToPosition(startPositionX,startPositionY));
		return new ComplexCommand(plotterCommands);				
	}
}
