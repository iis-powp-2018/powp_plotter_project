package edu.iss.powp.command;

public class ComplexShapeFactory {

    public static ComplexCommand rightPointedArrow() {
        ComplexCommand command = new ComplexCommand();
        command.addCommand(new CommandSetPosition(-100, 0));
        command.addCommand(new CommandDrawLineToPosition(100, 0));
        command.addCommand(new CommandDrawLineToPosition(50, -50));
        command.addCommand(new CommandSetPosition(100, 0));
        command.addCommand(new CommandDrawLineToPosition(50, 50));
        return command;
    }
}
