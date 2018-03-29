package edu.iis.powp.command;

import java.util.ArrayList;
import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand implements PlotterCommand {

	private ArrayList<PlotterCommand> commandList = new ArrayList<>();
	
	public void addCommandToList(PlotterCommand command) {
		commandList.add(command);
	}

	@Override
	public void execute(IPlotter driver) {
		for (PlotterCommand command : commandList) {
			command.execute(driver);
		}
	}
}
