package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

import java.sql.Driver;

public class CommandDrawLineToPosition implements IPlotterCommand {

    private int x,y;

    public CommandDrawLineToPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public void execute(IPlotter plotter) {
        plotter.drawTo(x,y);

    }
}
