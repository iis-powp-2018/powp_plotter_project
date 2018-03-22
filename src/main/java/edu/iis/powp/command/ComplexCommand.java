package edu.iis.powp.command;

import java.util.List;
import java.util.ArrayList;

import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand implements PlotterCommand{

	List<PlotterCommand> CommandList = new ArrayList<PlotterCommand>();
	
	@Override
	public void execute(IPlotter driver) {
		// TODO Auto-generated method stub
		
	}

}
