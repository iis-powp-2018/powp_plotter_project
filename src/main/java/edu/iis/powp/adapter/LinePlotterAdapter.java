package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;

public class LinePlotterAdapter implements IPlotter
{
    private int startX = 0, startY = 0;
    private DrawPanelController controller;
    private ILine line;

    public LinePlotterAdapter(DrawPanelController controller,ILine line) {
        this.controller = controller;
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

        this.startX = x;
        this.startY = y;

        controller.drawLine(line);
    }


    @Override
    public String toString()
    {
        return "@Q!$!@$!#@$(*#@&Q(%^*#@";
    }
}
