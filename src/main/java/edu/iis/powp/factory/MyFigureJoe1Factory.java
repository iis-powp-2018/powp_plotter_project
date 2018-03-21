package edu.iis.powp.factory;

import edu.iis.powp.command.CommandDrawLineToPosition;
import edu.iis.powp.command.CommandSetPosition;
import edu.iis.powp.command.ComplexCommand;
import edu.iis.powp.command.PlotterCommand;

public class MyFigureJoe1Factory {
	public static PlotterCommand prepareCommand(int x, int y, int sizeX) {
		ComplexCommand complexCommand = new ComplexCommand();
		complexCommand.addCommand(new CommandSetPosition(x, y))
		.addCommand(new CommandDrawLineToPosition(x + sizeX, y))
		.addCommand(new CommandDrawLineToPosition(x + sizeX, y + sizeX))
		.addCommand(new CommandSetPosition(x + sizeX, y + sizeX))
		.addCommand(new CommandDrawLineToPosition(x, y + sizeX))
		.addCommand(new CommandDrawLineToPosition(x, y))
		.addCommand(new CommandDrawLineToPosition(x+sizeX, y+sizeX))
		.addCommand(new CommandDrawLineToPosition(x, y + sizeX))
		.addCommand(new CommandDrawLineToPosition(x+sizeX, y));
		return complexCommand;
	}

}
