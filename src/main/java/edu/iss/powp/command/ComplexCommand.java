package edu.iss.powp.command;

import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand implements PlotterCommand {

	private int x0, x1, y0, y1;
	public ComplexCommand(int a0, int a1, int b0, int b1) {
		x0 = a0;
		x1 = a1;
		y0 = b0;
		y1 = b1;
	}
	
	@Override
	public void execute(IPlotter plotter) {
		plotter.setPosition(x0, x1);
		plotter.drawTo(y0, y1);
		plotter.drawTo(y0+50, y1-50);
		plotter.setPosition(y0, y1);
		plotter.drawTo(y0-50, y1+50);
	}

}
