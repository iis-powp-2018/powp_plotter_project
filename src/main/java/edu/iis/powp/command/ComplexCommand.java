package edu.iis.powp.command;

import java.util.List;

import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand implements PlotterCommand {

	private List<PlotterCommand> commandsList;
	
	public ComplexCommand(List<PlotterCommand> commandsList) {
		this.commandsList = commandsList;
	}
	
	public void addCommand(PlotterCommand command) {
		this.commandsList.add(command);
	}
	
	@Override
	public void execute(IPlotter iPlotter) {
		commandsList.forEach(Command -> Command.execute(iPlotter));
	}
	
}
