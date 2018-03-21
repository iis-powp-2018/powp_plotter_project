package edu.iis.powp.command;

import java.util.ArrayList;

public class TriangleFactory {

    public static CommandComplex createTriangle(int x0, int y0, int x1, int y1, int x2, int y2) {
        ArrayList<PlotterCommand> commands = new ArrayList<>();

        commands.add(new CommandSetPosition(x0,y0));
        commands.add(new CommandDrawLineToPosition(x1,y1));
        commands.add(new CommandDrawLineToPosition(x2,y2));
        commands.add(new CommandDrawLineToPosition(x0,y0));

        return new CommandComplex(commands);
    }
}
