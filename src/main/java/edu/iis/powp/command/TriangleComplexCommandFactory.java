package edu.iis.powp.command;

public class TriangleComplexCommandFactory {
	
	ComplexCommand getTriangleDrawCommand(int x0, int y0, int x1, int y1, int x2, int y2) {
		ComplexCommand cc = new ComplexCommand();
		
		cc.addCommand(new CommandSetPosition(x0, y0));
		cc.addCommand(new CommandDrawLineToPosition(x1, y1));
		cc.addCommand(new CommandDrawLineToPosition(x2, y2));
		cc.addCommand(new CommandDrawLineToPosition(x0, y0));
		
		return cc;
	}
		
}
