package edu.iis.powp.command;

import java.util.ArrayList;

public class ComplexCommandRectangle
{
	
	public static ComplexCommand getSquare() 
	{
		ArrayList<PlotterCommand> listPlotterCommand = new ArrayList<PlotterCommand>();
		
		listPlotterCommand.add(new CommandSetPosition(0,0));
		listPlotterCommand.add(new CommandDrawLine(0,200));
		listPlotterCommand.add(new CommandSetPosition(0,200));
		listPlotterCommand.add(new CommandDrawLine(200,200));
		listPlotterCommand.add(new CommandSetPosition(200,200));
		listPlotterCommand.add(new CommandDrawLine(200,0));
		listPlotterCommand.add(new CommandSetPosition(200,0));
		listPlotterCommand.add(new CommandDrawLine(0,0));		
		
		return new ComplexCommand(listPlotterCommand);		
	}
}
