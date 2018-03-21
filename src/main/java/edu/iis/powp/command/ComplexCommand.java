package edu.iis.powp.command;

import java.util.ArrayList;
import java.util.List;

import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand implements PlotterCommand {

	private List<PlotterCommand> listOfCommands;

	public ComplexCommand() {
		this.listOfCommands = new ArrayList<>();
	}

	public ComplexCommand addCommand(PlotterCommand command) {
		if (command != null) {
			listOfCommands.add(command);
		}
		return this;
	}

	@Override
	public void execute(IPlotter plotter) {
		listOfCommands.stream().forEach(command -> command.execute(plotter));
		
	}
}
