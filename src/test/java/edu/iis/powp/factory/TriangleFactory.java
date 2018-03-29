package edu.iis.powp.factory;

import java.util.ArrayList;
import java.util.List;

import edu.iis.powp.command.CommandDrawLineToPosition;
import edu.iis.powp.command.CommandSetPosition;
import edu.iis.powp.command.ComplexCommand;
import edu.iis.powp.command.PlotterCommand;

public class TriangleFactory {
	private static List<PlotterCommand> commandList = new ArrayList<>();

	public static ComplexCommand createTriangle(int x, int y,int heigth,int length){
		commandList.add(new CommandSetPosition(x,y));
		commandList.add(new CommandDrawLineToPosition(x+length,y));
		commandList.add(new CommandDrawLineToPosition(x+length/2,y-heigth));
		commandList.add(new CommandDrawLineToPosition(x,y));

		return new ComplexCommand(commandList);
	}
}
