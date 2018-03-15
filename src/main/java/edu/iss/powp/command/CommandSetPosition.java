package edu.iss.powp.command;

import edu.iis.client.plottermagic.IPlotter;

public class CommandSetPosition implements PlotterCommand{
	private int x;
	private int y;
	
	
	public CommandSetPosition(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void execute(IPlotter iPlotter) {
		iPlotter.setPosition(x, y);
	}
}
