package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

public class CommandSetPosition implements PlotterCommand  {
	private int x;
	private int y;

	public CommandSetPosition(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void execute(IPlotter driver) {
		// TODO Auto-generated method stub
		
	}
}