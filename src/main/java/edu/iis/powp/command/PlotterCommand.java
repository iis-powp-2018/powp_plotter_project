package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

public interface PlotterCommand extends IPlotter
{

	public void execute(IPlotter driver);
	
}
