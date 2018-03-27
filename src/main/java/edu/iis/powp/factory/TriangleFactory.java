package edu.iis.powp.factory;

import edu.iis.powp.command.CommandDrawLineToPosition;
import edu.iis.powp.command.CommandSetPosition;
import edu.iis.powp.command.ComplexCommand;
import edu.iis.powp.command.PlotterCommand;

import java.util.ArrayList;

public class TriangleFactory {
    private static ArrayList<PlotterCommand> plotterCommands = new ArrayList<>();

    public static ComplexCommand createTriangle(int startPositionX, int startPositionY, int length){
        plotterCommands.add(new CommandSetPosition(startPositionX,startPositionY));
        plotterCommands.add(new CommandDrawLineToPosition(startPositionX+length,startPositionY));
        plotterCommands.add(new CommandDrawLineToPosition(startPositionX+length,startPositionY+length));
        plotterCommands.add(new CommandDrawLineToPosition(startPositionX,startPositionY));
        return new ComplexCommand(plotterCommands);
    }
}