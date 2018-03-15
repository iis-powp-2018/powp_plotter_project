package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

public class CommandDrawLineToPosition implements PlotterCommand {
      private int x; //note to me : remember about encapsulation !!!
      private int y;
      
	public CommandDrawLineToPosition(int x, int y) {//constructor 
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public void execute(IPlotter plotter) {
		plotter.drawTo(x,y);
		
	}
	        
}
