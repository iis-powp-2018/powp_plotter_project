package edu.iis.powp.command;

import java.util.ArrayList;

import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand implements PlotterCommand {
	
	ArrayList<PlotterCommand> commandList  = new ArrayList<PlotterCommand>();
	
	@Override
	public void execute(IPlotter driver) {
		for(PlotterCommand command : commandList) {
			command.execute(driver);
		}
	}
	
	public void setCommandList(ArrayList<PlotterCommand> commandListArg) {
		commandList.clear();
		commandList.addAll(commandListArg);
	}
}
