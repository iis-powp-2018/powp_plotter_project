package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements PlotterCommand
{

	private List<PlotterCommand> commandList = new ArrayList<>();

	public void addCommandToList(PlotterCommand pc)
	{
		commandList.add(pc);
	}

	@Override
	public void execute(IPlotter driver)
	{
		//wykonaj wszystkie polecenia zawarte w commandList
		commandList.forEach(command -> command.execute(driver));
	}

}
