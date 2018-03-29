package edu.iis.powp.command;

import java.util.ArrayList;
import java.util.List;

import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand implements PlotterCommand {
	
	List<PlotterCommand> commandList;
	
	public ComplexCommand()	{
		commandList  = new ArrayList<PlotterCommand>();
	}
	
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
	
	public void addCommandToList(PlotterCommand command) {
		commandList.add(command);
	}
	
	public void clearCommandList()
	{
		commandList.clear();
	}
}
