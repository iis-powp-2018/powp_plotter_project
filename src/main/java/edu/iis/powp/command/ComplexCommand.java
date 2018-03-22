package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand implements PlotterCommand {

	private int x1;
	private int y1;
	private int x2;
	private int y2;
	
	public ComplexCommand(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	@Override
	public void execute(IPlotter iPlotter) {
		iPlotter.setPosition(x1, y1);	
		iPlotter.drawTo(x2,  y2);
	}
	
}
