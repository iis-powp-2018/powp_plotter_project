package edu.iis.powp.command;

import java.util.ArrayList;

import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand implements PlotterCommand {
	
	private ArrayList<PlotterCommand> commands;
	
	public ComplexCommand() {
		// TODO Auto-generated constructor stub
		commands = new ArrayList<>();
	}
	
	public void addCommand(PlotterCommand pC) {
		commands.add(pC);
	}
		
	@Override
	public void execute(IPlotter driver) {
		// TODO Auto-generated method stub
		for(PlotterCommand pC : commands) {
			pC.execute(driver);
		}
	}

}
