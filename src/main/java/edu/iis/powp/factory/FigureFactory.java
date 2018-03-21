package edu.iis.powp.factory;

import edu.iis.powp.command.ComplexCommand;

public class FigureFactory {
	public ComplexCommand getFigureCommand(FigureType type) {
		switch (type) {
		case RECTANGLE:
			return null;
		case SQUARE:
			return null;
		case TRIANGLE:
			return null;
		default:
			throw new RuntimeException("Unexpected param value");
		}
	}
}
