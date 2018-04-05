package edu.iis.powp.factory;

import edu.iis.powp.command.CommandDrawLineToPosition;
import edu.iis.powp.command.CommandSetPosition;
import edu.iis.powp.command.ComplexCommand;

public class FigureFactory {
    public static ComplexCommand square() {
        ComplexCommand command = new ComplexCommand();
        command.addCommandToList(new CommandSetPosition(100, 100));
        command.addCommandToList(new CommandDrawLineToPosition(100, -100));
        command.addCommandToList(new CommandDrawLineToPosition(-100, -100));
        command.addCommandToList(new CommandDrawLineToPosition(-100, 100));
        command.addCommandToList(new CommandDrawLineToPosition(100, 100));
        return command;
    }

    public static ComplexCommand star() {
        ComplexCommand command = new ComplexCommand();
        command.addCommandToList(new CommandSetPosition(0, -100));
        command.addCommandToList(new CommandDrawLineToPosition(40, 0));
        command.addCommandToList(new CommandDrawLineToPosition(120, 0));
        command.addCommandToList(new CommandDrawLineToPosition(60, 50));
        command.addCommandToList(new CommandDrawLineToPosition(100, 160));
        command.addCommandToList(new CommandDrawLineToPosition(0, 90));
        command.addCommandToList(new CommandDrawLineToPosition(-100, 160));
        command.addCommandToList(new CommandDrawLineToPosition(-60, 50));
        command.addCommandToList(new CommandDrawLineToPosition(-120, 0));
        command.addCommandToList(new CommandDrawLineToPosition(-40, 0));
        command.addCommandToList(new CommandDrawLineToPosition(0, -100));
        return command;
    }

    public static ComplexCommand triangle(){
        ComplexCommand command = new ComplexCommand();
        command.addCommandToList(new CommandSetPosition(0, -100));
        command.addCommandToList(new CommandDrawLineToPosition(100, 100));
        command.addCommandToList(new CommandDrawLineToPosition(-100, 100));
        command.addCommandToList(new CommandDrawLineToPosition(0, -100));
        return command;
    }
}