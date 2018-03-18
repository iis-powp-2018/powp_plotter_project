package edu.iis.powp.command;

import java.util.ArrayList;

public class CircleFactory {
	public static ComplexCommand createCircle(int circleX, int circleY, int r) {
		ArrayList<PlotterCommand> commands = new ArrayList<PlotterCommand>();
		float step = 0.0f;
		double x = circleX + r * Math.cos(step);
		double y = circleY + r * Math.sin(step);
		PlotterCommand command = new CommandSetPosition((int)x, (int)y);
		commands.add(command);
		for(int i =1; i< 628;i++) {
			x = circleX + r * Math.cos(step);
			y = circleY + r * Math.sin(step);
			step += 0.01f;
			
			command = new CommandDrawLineToPosition((int)x, (int)y);
			commands.add(command);
		}
		
		return new ComplexCommand(commands);
	}
}
