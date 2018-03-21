package edu.iis.powp.command;

import java.util.List;

import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand implements PlotterCommand{
	private List<PlotterCommand> listOfCommands;
	
	public ComplexCommand(List<PlotterCommand> commands) {
		listOfCommands = commands;
	}
	
	@Override
	public void execute(IPlotter plotter) {
		for(PlotterCommand command : listOfCommands) {
			command.execute(plotter);
		}
		
	}
	

}
