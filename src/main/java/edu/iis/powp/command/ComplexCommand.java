package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

/**
 * Draws rectangle using IPlotter driver starting from point (0, 0)
 */
public class ComplexCommand implements PlotterCommand  {
    private int width;
    private int height;

    public ComplexCommand(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void execute(IPlotter plotter) {
        plotter.setPosition(0, 0);
        plotter.drawTo(width, 0);
        plotter.drawTo(width, height);
        plotter.drawTo(0, height);
        plotter.drawTo(0, 0);
    }
}
