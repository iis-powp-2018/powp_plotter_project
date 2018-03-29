package edu.iis.powp.command;

import java.util.List;
import java.util.ArrayList;

import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand implements PlotterCommand{

	private List<PlotterCommand> CommandList;
	
	public ComplexCommand(List<PlotterCommand> CommandList){
		this.CommandList=CommandList;
	}
	public void addCommand(PlotterCommand Command) {
		this.CommandList.add(Command);
	}
	
	@Override
	public void execute(IPlotter driver) {
		CommandList.forEach(Command -> Command.execute(driver));
		
	}

}