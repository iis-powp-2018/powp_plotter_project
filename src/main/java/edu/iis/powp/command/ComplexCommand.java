package edu.iis.powp.command;

import java.util.List;

import edu.iis.client.plottermagic.IPlotter;


public class ComplexCommand implements PlotterCommand {

	private List<PlotterCommand> plotterCommandsList;

	public ComplexCommand(List<PlotterCommand> plotterCommandsList) {
		this.plotterCommandsList = plotterCommandsList;
	}

	@Override
	public void execute(IPlotter plotter) {
		for (PlotterCommand plotterCommand : plotterCommandsList) {
			plotterCommand.execute(plotter);
		}
	}
}
