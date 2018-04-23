package edu.iis.powp.factory;

import edu.iis.powp.command.CommandDrawLineToPosition;
import edu.iis.powp.command.CommandSetPosition;
import edu.iis.powp.command.ComplexCommand;

public class TriangleFactory extends ShapeFactory {
    @Override
    public ComplexCommand createShapeCommand() {
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new CommandSetPosition(0, 0));
        complexCommand.addCommand(new CommandDrawLineToPosition(100, 0));
        complexCommand.addCommand(new CommandDrawLineToPosition(50, 100));
        complexCommand.addCommand(new CommandDrawLineToPosition(0, 0));
        return complexCommand;
    }
}