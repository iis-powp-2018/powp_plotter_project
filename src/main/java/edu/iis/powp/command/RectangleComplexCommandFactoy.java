package edu.iis.powp.command;

public class RectangleComplexCommandFactoy {

	ComplexCommand getRectangleDrawCommand(int startPosX, int startPosY, int height, int width) {
		ComplexCommand cc = new ComplexCommand();
		
		cc.addCommand(new CommandSetPosition(startPosX, startPosY));
		cc.addCommand(new CommandDrawLineToPosition(0, -height));
		cc.addCommand(new CommandDrawLineToPosition(width, 0));
		cc.addCommand(new CommandDrawLineToPosition(0, height));
		cc.addCommand(new CommandDrawLineToPosition(-width, 0));
		
		return cc;
	}
	
	ComplexCommand getSquareDrawCommand(int startPosX, int startPosY, int width) {
		ComplexCommand cc = new ComplexCommand();
		
		cc.addCommand(new CommandSetPosition(startPosX, startPosY));
		cc.addCommand(new CommandDrawLineToPosition(0, -width));
		cc.addCommand(new CommandDrawLineToPosition(width, 0));
		cc.addCommand(new CommandDrawLineToPosition(0, width));
		cc.addCommand(new CommandDrawLineToPosition(-width, 0));

		return cc;
	}
}
