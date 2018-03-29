package edu.iis.powp.command;

import java.util.ArrayList;
import java.util.List;

public class RectangleFactory {

    private RectangleFactory() {

    }

    public static ComplexCommand createRectangle(int x, int y, int width, int height) {
        List<PlotterCommand> plotterCommands = new ArrayList<>();

        plotterCommands.add(new CommandSetPosition(x, y));
        plotterCommands.add(new CommandDrawLineToPosition(x + width, y));
        plotterCommands.add(new CommandDrawLineToPosition(x + width, y + height));
        plotterCommands.add(new CommandDrawLineToPosition(x, y + height));
        plotterCommands.add(new CommandDrawLineToPosition(x, y));

        return new ComplexCommand(plotterCommands);
    }
}
