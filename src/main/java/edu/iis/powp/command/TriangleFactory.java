package edu.iis.powp.command;

import java.util.ArrayList;
import java.util.List;

public class TriangleFactory {

    private TriangleFactory() {

    }

    public static ComplexCommand createTriangle(int x0, int y0, int x1, int y1, int x2, int y2) {
        List<PlotterCommand> plotterCommands = new ArrayList<>();

        plotterCommands.add(new CommandSetPosition(x0, y0));
        plotterCommands.add(new CommandDrawLineToPosition(x1, y1));
        plotterCommands.add(new CommandDrawLineToPosition(x2, y2));
        plotterCommands.add(new CommandDrawLineToPosition(x0, y0));

        return new ComplexCommand(plotterCommands);
    }
}
