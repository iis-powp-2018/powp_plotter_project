package edu.iis.powp.Factories;

import edu.iis.powp.command.CommandDrawLineToPosition;
import edu.iis.powp.command.CommandSetPosition;
import edu.iis.powp.command.ComplexCommand;
import edu.iis.powp.command.PlotterCommand;

import java.util.ArrayList;

public class RectangleFactory {

    private static ArrayList<PlotterCommand> plotterCommands = new ArrayList<>();
    public static ComplexCommand createRectangle (int startX, int startY, int width, int height){
        plotterCommands.add(new CommandSetPosition(startX,startY));
        plotterCommands.add(new CommandDrawLineToPosition(startX + width, startY));
        plotterCommands.add(new CommandDrawLineToPosition(startX + width, startY - height));
        plotterCommands.add(new CommandDrawLineToPosition(startX, startY - height));
        plotterCommands.add(new CommandDrawLineToPosition(startX,startY));
        return new ComplexCommand(plotterCommands);
    }
}
