package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand implements PlotterCommand {

    private int x;
    private int y;

    public ComplexCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute(IPlotter plotter) {
        plotter.drawTo(10, 10);
        plotter.setPosition(100, 100);
        plotter.drawTo(-10, 10);
        plotter.drawTo(100,-100);
        plotter.setPosition(0,0);
        plotter.drawTo(-10,-10);
    }
}
