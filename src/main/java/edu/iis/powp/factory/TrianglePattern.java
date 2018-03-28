package edu.iis.powp.factory;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.command.CommandDrawLineToPosition;
import edu.iis.powp.command.CommandSetPosition;
import edu.iis.powp.command.ComplexCommand;

public class TrianglePattern implements Pattern {
    @Override
    public void draw(IPlotter plotter) {
        ComplexCommand commands = new ComplexCommand();
        commands.setCommand(new CommandSetPosition(0,0));
        commands.setCommand(new CommandDrawLineToPosition(100,100));
        commands.setCommand(new CommandDrawLineToPosition(-100,100));
        commands.setCommand(new CommandDrawLineToPosition(0,0));
        commands.execute(plotter);
    }
}
