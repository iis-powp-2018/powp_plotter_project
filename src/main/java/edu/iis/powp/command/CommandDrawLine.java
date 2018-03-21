package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

public class CommandDrawLine implements PlotterCommand 
{
	private int x;
	private int y;
	
	public CommandDrawLine(int x, int y) 
	{
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void execute(IPlotter iPlotter) {
		iPlotter.drawTo(this.x, this.y);
	}
}
