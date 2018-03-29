package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.appext.ApplicationWithDrawer;
import edu.kis.powp.drawer.panel.DefaultDrawerFrame;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;


/**
 * Plotter adapter to drawer.
 */
public class LinePlotterAdapter implements IPlotter
{
    private int startX = 0, startY = 0;
    private DrawPanelController controller;
    private ILine line = LineFactory.getBasicLine();


    public LinePlotterAdapter(DrawPanelController controller) {
        this.controller = controller;
    }


    public void setLine(ILine line) {
        this.line = line;
    }

    @Override
    public void setPosition(int x, int y)
    {
        this.startX = x;
        this.startY = y;
    }


    @Override
    public void drawTo(int x, int y)
    {
        line.setStartCoordinates(this.startX, this.startY);
        this.setPosition(x, y);
        line.setEndCoordinates(x, y);
        controller.drawLine(line);
    }

    @Override
    public String toString()
    {
        return PlotterAdapter.class.getSimpleName();
    }
}
