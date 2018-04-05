package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

public class CommandDrawLineToPosition implements PlotterCommand{

    private int x;
    private int y;

    @Override public void execute(IPlotter iPlotter) {
        iPlotter.drawTo(this.x,this.y);
    }

    public CommandDrawLineToPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
