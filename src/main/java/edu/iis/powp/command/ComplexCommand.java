package edu.iis.powp.command;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand {
	List<PlotterCommand> listOfCommands;
	
    public ComplexCommand() {
		super();
		this.listOfCommands = new ArrayList<>();
	}


	void addCommand(PlotterCommand command) {
    	//needs to fix this implementation yet 
    	if(command!=null) {
    	listOfCommands.add(command);
    	}
	}
}
