package edu.iis.powp.factory;

import java.util.ArrayList;
import java.util.List;

import edu.iis.powp.command.*;

public class RectangleFactory {
	private static List<PlotterCommand> commandList = new ArrayList<>();

	public static ComplexCommand createRectangle(int x, int y, int width,int heigth){
		commandList.add(new CommandSetPosition(x,y));
		commandList.add(new CommandDrawLineToPosition(x+width,y));
		commandList.add(new CommandDrawLineToPosition(x+width,y+heigth));
		commandList.add(new CommandDrawLineToPosition(x,y+heigth));
		commandList.add(new CommandDrawLineToPosition(x,y));

		return new ComplexCommand(commandList);

	}
}
