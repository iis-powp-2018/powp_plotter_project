package edu.iis.powp.command;

import java.util.ArrayList;
import java.util.List;

public class CommandsFactory {
	
	public static ComplexCommand getRectantgle() {
		
		List<PlotterCommand> listPlotterCommand = new ArrayList<PlotterCommand>();
		
		listPlotterCommand.add(new CommandSetPosition(-100, -100));
		listPlotterCommand.add(new CommandDrawLineToPosition(100, -100));
		listPlotterCommand.add(new CommandDrawLineToPosition(100, 100));
		listPlotterCommand.add(new CommandDrawLineToPosition(-100, 100));
		listPlotterCommand.add(new CommandDrawLineToPosition(-100, -100));
		
		return new ComplexCommand(listPlotterCommand);
    }

   public static ComplexCommand getTriangle() {
	   
	   List<PlotterCommand> listPlotterCommand = new ArrayList<PlotterCommand>();

	   
	   listPlotterCommand.add(new CommandSetPosition(-100, -100));
	   listPlotterCommand.add(new CommandDrawLineToPosition(100, -100));
	   listPlotterCommand.add(new CommandDrawLineToPosition(0, 100));
	   listPlotterCommand.add(new CommandDrawLineToPosition(-100, -100));
	    return new ComplexCommand(listPlotterCommand);
    }

}
