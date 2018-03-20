package edu.iis.powp.factory;

import edu.iis.powp.command.CommandDrawLineToPosition;
import edu.iis.powp.command.CommandSetPosition;
import edu.iis.powp.command.ComplexCommand;
import edu.iis.powp.command.PlotterCommand;

public class RectangleFactory {
	public static PlotterCommand prepareCommand(int x, int y, int sizeX, int sizeY) {
		ComplexCommand complexCommand = new ComplexCommand();
		complexCommand.addCommand(new CommandSetPosition(x, y));
		complexCommand.addCommand(new CommandDrawLineToPosition(x + sizeX, y));
		complexCommand.addCommand(new CommandDrawLineToPosition(x + sizeX, y + sizeY));
		complexCommand.addCommand(new CommandSetPosition(x + sizeX, y + sizeY));
		complexCommand.addCommand(new CommandDrawLineToPosition(x, y + sizeY));
		complexCommand.addCommand(new CommandDrawLineToPosition(x, y));
		return complexCommand;
	}
}
