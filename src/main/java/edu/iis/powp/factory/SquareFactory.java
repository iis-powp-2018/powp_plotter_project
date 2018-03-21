package edu.iis.powp.factory;

import edu.iis.powp.command.PlotterCommand;

public class SquareFactory {

	public static PlotterCommand prepareCommand(int x, int y, int sizeX) {
		return RectangleFactory.prepareCommand(x, y, sizeX, sizeX);
	}
}
