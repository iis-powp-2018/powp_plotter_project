package edu.iis.powp.factory;

import edu.iis.powp.command.CommandDrawLineToPosition;
import edu.iis.powp.command.CommandSetPosition;
import edu.iis.powp.command.ComplexCommand;

public class RectangleFactory extends ShapeFactory {

    @Override
    public ComplexCommand createShapeCommand() {
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new CommandSetPosition(0, 0));
        complexCommand.addCommand(new CommandDrawLineToPosition(0, 100));
        complexCommand.addCommand(new CommandDrawLineToPosition(50, 100));
        complexCommand.addCommand(new CommandDrawLineToPosition(50, 0));
        complexCommand.addCommand(new CommandDrawLineToPosition(0, 0));
        return complexCommand;
    }
}