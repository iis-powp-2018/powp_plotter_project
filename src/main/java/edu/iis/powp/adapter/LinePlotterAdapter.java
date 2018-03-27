package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.appext.ApplicationWithDrawer;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;

public class LinePlotterAdapter extends DrawPanelController implements IPlotter {
    private int startX = 0, startY = 0;


    public LinePlotterAdapter() {
        super();
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
        ILine line = LineFactory.getSpecialLine();
        line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);
        setPosition(x,y);

        ApplicationWithDrawer.getDrawPanelController().drawLine(line);
    }

    @Override
    public String toString()
    {
        return "@Q!$!@$!#@$(*#@&Q(%^*#@";
    }
}