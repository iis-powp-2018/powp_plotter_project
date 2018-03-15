package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.appext.ApplicationWithDrawer;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;

import javax.swing.*;

public class LinePlotterAdapter extends DrawPanelController implements IPlotter
{
    private int startX = 0, startY = 0;
    private ILine line;
    DrawPanelController drawPanel;

    public LinePlotterAdapter(DrawPanelController drawPanel, ILine line) {
        super();
        this.line = line;
        this.drawPanel = drawPanel;

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
        drawPanel.drawLine(line);

    }

    @Override
    public String toString()
    {
        return "Plotter" + line.getColor().toString() + "Line";
    }


}
