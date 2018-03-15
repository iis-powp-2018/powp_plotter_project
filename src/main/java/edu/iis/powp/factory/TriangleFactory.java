package edu.iis.powp.factory;

import edu.iis.powp.command.CommandDrawLineToPosition;
import edu.iis.powp.command.CommandSetPosition;
import edu.iis.powp.command.ComplexCommand;

public class TriangleFactory {

	public ComplexCommand getTriangleDrawCommand(int pos_x, int pos_y, int point1_x, int point1_y, int point2_x, int point2_y)
	{
		ComplexCommand command = new ComplexCommand();
		command.addCommand(new CommandSetPosition(pos_x, pos_y));
		command.addCommand(new CommandDrawLineToPosition(point1_x, point1_y));
		command.addCommand(new CommandDrawLineToPosition(point2_x, point2_y));
		command.addCommand(new CommandDrawLineToPosition(pos_x, pos_y));
		return command;
	}
}
