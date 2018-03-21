package edu.iis.powp.factory;

import edu.iis.powp.command.CommandDrawLineToPosition;
import edu.iis.powp.command.CommandSetPosition;
import edu.iis.powp.command.ComplexCommand;
import edu.iis.powp.command.PlotterCommand;

public class TriangleFactory {
	public static PlotterCommand prepareCommand(int xA, int yA, int xB, int yB, int xC, int yC) {
		ComplexCommand complex = new ComplexCommand();
		complex.addCommand(new CommandSetPosition(xA, yA))
			.addCommand(new CommandDrawLineToPosition(xB, yB))
			.addCommand(new CommandDrawLineToPosition(xC, yC))
			.addCommand(new CommandDrawLineToPosition(xA, yA));
		return complex;
	}
}
