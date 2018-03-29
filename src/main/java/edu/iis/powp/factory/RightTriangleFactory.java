package edu.iis.powp.factory;

import edu.iis.powp.command.CommandDrawLineToPosition;
import edu.iis.powp.command.CommandSetPosition;
import edu.iis.powp.command.ComplexCommand;

public class RightTriangleFactory extends ShapeFactory {
    private int width;
    private int height;
    private int startX;
    private int startY;

    public RightTriangleFactory(int width, int height) {
        this(width, height, 0, 0);
    }

    public RightTriangleFactory(int width, int height, int startX, int startY) {
        this.width = width;
        this.height = height;
        this.startX = startX;
        this.startY = startY;
    }

    @Override
    public ComplexCommand createShape() {
        ComplexCommand command = new ComplexCommand();

        command.addPlotterCommand(new CommandSetPosition(startX, startY));
        command.addPlotterCommand(new CommandDrawLineToPosition(startX + width, startY));
        command.addPlotterCommand(new CommandDrawLineToPosition(startX, startY + height));
        command.addPlotterCommand(new CommandDrawLineToPosition(startX, startY));

        return command;
    }
}
