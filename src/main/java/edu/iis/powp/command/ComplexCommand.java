package edu.iis.powp.command;

import java.util.List;
import java.util.LinkedList;

import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand implements PlotterCommand {
	private List<PlotterCommand> commands;
	
	public ComplexCommand()
	{
		commands = new LinkedList<PlotterCommand>();
	}
	
	public ComplexCommand(List<PlotterCommand> list)
	{
		commands = list;
	}
	
	public void addCommand(PlotterCommand command)
	{
		commands.add(command);
	}
	
	@Override
	public void execute(IPlotter driver) {
		for(PlotterCommand command : commands)
		{
			command.execute(driver);
		}
	}

}
