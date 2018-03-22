package edu.iis.powp.command;

import java.util.List;

import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand implements PlotterCommand {
	
	private List<PlotterCommand>ListOfCommands;
	
	public ComplexCommand(List<PlotterCommand> commands) {
		ListOfCommands = commands;
	}

	@Override
	public void execute(IPlotter plotter) {
		for(PlotterCommand command : ListOfCommands) {
			command.execute(plotter);
		}
	}

}
