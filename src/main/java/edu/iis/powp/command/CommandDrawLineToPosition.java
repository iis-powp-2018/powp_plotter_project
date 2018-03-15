package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

public class CommandDrawLineToPosition implements PlotterCommand {
	private int x;
	private int y;
	
	public CommandDrawLineToPosition(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void execute(IPlotter driver) {
		// TODO Auto-generated method stub
		
	}
}