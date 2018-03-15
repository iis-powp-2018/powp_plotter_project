package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.appext.ApplicationWithDrawer;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;

public class LinePlotterDrawerAdapter implements IPlotter {

    private int startX = 0, startY = 0;
    private ILine line;

    public LinePlotterDrawerAdapter(DrawPanelController drawPanel, ILine basicLine) {
        this.line = basicLine;
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
        line.setStartCoordinates(this.startX,this.startY);
        line.setEndCoordinates(x,y);
        ApplicationWithDrawer.getDrawPanelController().drawLine(line);
    }

    @Override
    public String toString()
    {
        return "Line Plotter Drawer";
    }
}
