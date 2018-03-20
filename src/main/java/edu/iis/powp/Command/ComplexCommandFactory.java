package edu.iis.powp.command;

import edu.iis.powp.Command.CommandDrawLineToPosition;
import edu.iis.powp.Command.CommandSetPosition;
import edu.iis.powp.Command.ComplexCommand;
import edu.iis.powp.Command.IPlotterCommand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ComplexCommandFactory {

    private static IPlotterCommand createRectangle(int x1, int y1, int x2, int y2) {
        List<IPlotterCommand> commands = new ArrayList<>(Arrays.asList(
                new CommandSetPosition(x1, y1),
                new CommandDrawLineToPosition(x1, y2),
                new CommandDrawLineToPosition(x2, y2),
                new CommandDrawLineToPosition(x2, y1),
                new CommandDrawLineToPosition(x1, y1)
        ));

        return new ComplexCommand(commands);
    }

    public static IPlotterCommand createSquare(int x, int y, int side) {
        return createRectangle(x, y, x + side, y + side);
    }

    public static IPlotterCommand createTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        List<IPlotterCommand> commands = new ArrayList<>(Arrays.asList(
                new CommandSetPosition(x1, y1),
                new CommandDrawLineToPosition(x2, y2),
                new CommandDrawLineToPosition(x3, y3),
                new CommandDrawLineToPosition(x1, y1)
        ));

        return new ComplexCommand(commands);
    }

}