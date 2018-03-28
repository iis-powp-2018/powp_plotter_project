package edu.iis.powp.factory;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.command.CommandDrawLineToPosition;
import edu.iis.powp.command.CommandSetPosition;
import edu.iis.powp.command.ComplexCommand;
import edu.iis.powp.command.PlotterCommand;

import java.util.ArrayList;
import java.util.List;

public class SquarePattern implements Pattern {

    @Override
    public void draw(IPlotter plotter) {
        ComplexCommand commands = new ComplexCommand();
        commands.setCommand(new CommandSetPosition(-120,-120));
        commands.setCommand(new CommandDrawLineToPosition(120,-120));
        commands.setCommand(new CommandDrawLineToPosition(120,120));
        commands.setCommand(new CommandDrawLineToPosition(-120,120));
        commands.setCommand(new CommandDrawLineToPosition(-120,-120));
        commands.execute(plotter);
    }
}
