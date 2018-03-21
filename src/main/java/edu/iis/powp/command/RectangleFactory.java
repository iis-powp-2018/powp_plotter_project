package edu.iis.powp.command;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RectangleFactory {

    public static CommandComplex createRectangle(int x, int y, int w, int h) {
        ArrayList<PlotterCommand> commands = new ArrayList<>();

        commands.add(new CommandSetPosition(x,y));
        commands.add(new CommandDrawLineToPosition(x+w,y));
        commands.add(new CommandDrawLineToPosition(x+w,y+h));
        commands.add(new CommandDrawLineToPosition(x,y+h));
        commands.add(new CommandDrawLineToPosition(x,y));

        return new CommandComplex(commands);
    }
}

