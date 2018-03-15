package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.appext.ApplicationWithDrawer;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;


/**
 * Plotter adapter to drawer with several bugs.
 */
public class LinePlotterAdapter extends DrawPanelController implements IPlotter
{
    ILine line;
    private int startX = 0, startY = 0;

    public LinePlotterAdapter(ILine line) {
        super();
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
        line.setEndCoordinates(x, y);
        setPosition(x,y);
        ApplicationWithDrawer.getDrawPanelController().drawLine(line);
    }

    @Override
    public String toString()
    {
        return "Simulator using LinePlotterAdapter";
    }
}
