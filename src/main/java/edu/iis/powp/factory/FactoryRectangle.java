package edu.iis.powp.factory;

import java.util.ArrayList;
import edu.iis.powp.command.*;

public class FactoryRectangle {
	private static ArrayList<PlotterCommand> plotterCommands = new ArrayList<>();
	
	public  static ComplexCommand createRectangle (int startX, int startY, int width, int height) {
		
		plotterCommands.add(new CommandSetPosition(startX,startY));
        plotterCommands.add(new CommandDrawLineToPosition(startX+width,startY));
        plotterCommands.add(new CommandDrawLineToPosition(startX+width,startY-height));
        plotterCommands.add(new CommandDrawLineToPosition(startX,startY-height));
        plotterCommands.add(new CommandDrawLineToPosition(startX,startY));
        
        return new ComplexCommand(plotterCommands); 
	}
}