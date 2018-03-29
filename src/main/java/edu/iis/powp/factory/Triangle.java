package edu.iis.powp.factory;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.command.CommandDrawLineToPosition;
import edu.iis.powp.command.CommandSetPosition;
import edu.iis.powp.command.ComplexCommand;

public class Triangle implements Figure {

    @Override
    public void draw(IPlotter driver) {
        ComplexCommand commandList = new ComplexCommand();
        commandList.addCommandToList(new CommandSetPosition(-80,-80));
        commandList.addCommandToList(new CommandDrawLineToPosition(80,-80));
        commandList.addCommandToList(new CommandDrawLineToPosition(0,80));
        commandList.addCommandToList(new CommandDrawLineToPosition(-80,-80));
        commandList.execute(driver);
    }
}
