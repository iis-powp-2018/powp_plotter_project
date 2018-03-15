package edu.iis.powp.factory;

import edu.iis.powp.command.CommandDrawLineToPosition;
import edu.iis.powp.command.CommandSetPosition;
import edu.iis.powp.command.ComplexCommand;

public class RectangleFactory {
	
	public ComplexCommand getRectangleDrawCommand(int pos_x, int pos_y, int size_x, int size_y)
	{
		ComplexCommand command = new ComplexCommand();
		command.addCommand(new CommandSetPosition(pos_x, pos_y));
		command.addCommand(new CommandDrawLineToPosition(pos_x+size_x, pos_y));
		command.addCommand(new CommandDrawLineToPosition(pos_x+size_x, pos_y+size_y));
		command.addCommand(new CommandDrawLineToPosition(pos_x, pos_y+size_y));
		command.addCommand(new CommandDrawLineToPosition(pos_x, pos_y));
		return command;
	}
}
