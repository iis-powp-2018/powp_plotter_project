package edu.iis.powp.factory;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.command.CommandDrawLineToPosition;
import edu.iis.powp.command.CommandSetPosition;
import edu.iis.powp.command.ComplexCommand;

public class Circle implements Figure{

    @Override
    public void draw(IPlotter driver) {
        double x,y;
        int radious = 100;

        ComplexCommand commandList = new ComplexCommand();
        commandList.addCommandToList(new CommandSetPosition(radious, 0));
        for(float pi=0; pi<(Math.PI*2); pi+=0.05) {
            x = radious * Math.cos(pi);
            y = radious * Math.sin(pi);
            commandList.addCommandToList(new CommandDrawLineToPosition((int)x, (int)y));
        }
        commandList.execute(driver);
    }
}
