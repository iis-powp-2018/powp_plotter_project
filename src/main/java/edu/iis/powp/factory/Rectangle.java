package edu.iis.powp.factory;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.command.CommandDrawLineToPosition;
import edu.iis.powp.command.CommandSetPosition;
import edu.iis.powp.command.ComplexCommand;

public class Rectangle implements Figure {

    @Override
    public void draw(IPlotter driver) {
        ComplexCommand commandList = new ComplexCommand();
        commandList.addCommandToList(new CommandSetPosition(-120,80));
        commandList.addCommandToList(new CommandDrawLineToPosition(-120,-80));
        commandList.addCommandToList(new CommandDrawLineToPosition(120,-80));
        commandList.addCommandToList(new CommandDrawLineToPosition(120,80));
        commandList.addCommandToList(new CommandDrawLineToPosition(-120,80));
        commandList.execute(driver);
    }
}
