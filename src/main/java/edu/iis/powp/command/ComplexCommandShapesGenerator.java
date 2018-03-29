package edu.iis.powp.command;

public class ComplexCommandShapesGenerator {
	
	public ComplexCommand generateRectangle(int leftTopX, int leftTopY, int rightBottomX, int rightBottomY) {
		ComplexCommand complexCommand = new ComplexCommand();
		complexCommand.addCommandToList(new CommandSetPosition(leftTopX, leftTopY));
		complexCommand.addCommandToList(new CommandDrawLineToPosition(rightBottomX, leftTopY));
		complexCommand.addCommandToList(new CommandSetPosition(rightBottomX, leftTopY));
		complexCommand.addCommandToList(new CommandDrawLineToPosition(rightBottomX, rightBottomY));
		complexCommand.addCommandToList(new CommandSetPosition(rightBottomX, rightBottomY));
		complexCommand.addCommandToList(new CommandDrawLineToPosition(leftTopX, rightBottomY));
		complexCommand.addCommandToList(new CommandSetPosition(leftTopX, rightBottomY));
		complexCommand.addCommandToList(new CommandDrawLineToPosition(leftTopX, leftTopY));
		return complexCommand;
	}
	
	public ComplexCommand generateTriangle(int X1, int Y1, int X2, int Y2, int X3, int Y3) {
		ComplexCommand complexCommand = new ComplexCommand();
		complexCommand.addCommandToList(new CommandSetPosition(X1, Y1));
		complexCommand.addCommandToList(new CommandDrawLineToPosition(X2, Y2));
		complexCommand.addCommandToList(new CommandSetPosition(X2, Y2));
		complexCommand.addCommandToList(new CommandDrawLineToPosition(X3, Y3));
		complexCommand.addCommandToList(new CommandSetPosition(X3, Y3));
		complexCommand.addCommandToList(new CommandDrawLineToPosition(X1, Y1));
		return complexCommand;
	}
}
