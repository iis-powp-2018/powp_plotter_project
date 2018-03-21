package edu.iis.powp.command;

import java.util.ArrayList;

public class RectangleFactory {
	public static ComplexCommand createRectangle(int startX, int startY, int width, int height) {
		ArrayList<PlotterCommand> commands = new ArrayList();
		
		commands.add(new CommandSetPosition(startX,startY));
		commands.add(new CommandDrawLineToPosition(startX+width,startY));
		commands.add(new CommandDrawLineToPosition(startX+width,startY+height));
		commands.add(new CommandDrawLineToPosition(startX,startY+height));
		commands.add(new CommandDrawLineToPosition(startX,startY));
		
		return new ComplexCommand(commands);
		
		
	}
}
