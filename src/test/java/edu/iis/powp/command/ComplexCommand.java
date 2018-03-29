package edu.iis.powp.command;

import java.util.List;

import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand implements PlotterCommand {

	private List<PlotterCommand> commandList;

	public ComplexCommand(List<PlotterCommand> commandList) {
		this.commandList = commandList;
	}

	@Override
	public void execute(IPlotter iPlotter) {
		for(PlotterCommand command : commandList){
			command.execute(iPlotter);
		}
	}

}
