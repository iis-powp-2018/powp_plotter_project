package edu.iis.powp.command;

import java.util.ArrayList;
import java.util.List;

import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand {
	
	private final IPlotter plotter;
	private List<PlotterCommand> listOfCommands;

	public ComplexCommand(IPlotter plotter) {
		
		this.plotter = plotter;
		this.listOfCommands = new ArrayList<>();
	}
	
	

	void addCommand(PlotterCommand command) {
		if (command != null) {
			listOfCommands.add(command);
		}
	}
	
	public void performAll() {
		listOfCommands.stream().forEach(command -> command.execute(plotter));
	}
}
