package edu.iss.powp.command;

import java.util.List;

import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand implements PlotterCommand {
	
	List<PlotterCommand> command;
	
	public ComplexCommand(List<PlotterCommand> command) {
		this.command = command;
	}

	@Override
	public void execute(IPlotter iPlotter) {
		command.stream().forEach((pc) -> {
			pc.execute(iPlotter);
		});
	}
}
