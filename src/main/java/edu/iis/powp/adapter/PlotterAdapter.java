package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.AbstractPlotter;
import edu.iis.client.plottermagic.IPlotter;
import edu.iis.client.plottermagic.preset.FiguresJane;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.appext.ApplicationWithDrawer;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;


/**
 * Plotter adapter to drawer with several bugs. 
 */
public class PlotterAdapter extends AbstractPlotter
{

    public PlotterAdapter(int x, int y) {
        super(x, y);
    }

    @Override
    public void drawTo(int i, int i1) {
        ILine line = LineFactory.getBasicLine();
        line.setStartCoordinates(this.getX(), this.getY());
        line.setEndCoordinates(i, i1);
        this.setPosition(i,i1);

        ApplicationWithDrawer.getDrawPanelController().drawLine(line);
    }
}
