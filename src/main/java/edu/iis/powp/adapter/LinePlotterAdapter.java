package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.appext.ApplicationWithDrawer;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;


/**
 * Plotter adapter to drawer with several bugs.
 */
public class LinePlotterAdapter extends DrawPanelController implements IPlotter
{
    private int startX = 0, startY = 0;
    private ILine line = LineFactory.getDottedLine();
    private DrawPanelController dpc;

    public LinePlotterAdapter() {
        super();
    }

    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void drawTo(int x, int y) {
        line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);
        this.startX = x;
        this.startY = y;

        ApplicationWithDrawer.getDrawPanelController().drawLine(line);
    }


    @Override
    public String toString() {
        return "Line Picker Plotter";
    }

    public void setSpecialLineType(){
        line = LineFactory.getSpecialLine();
    }

    public void setDottedLineType(){
        line = LineFactory.getDottedLine();
    }

    public void setBasicLineType() {
        line = LineFactory.getBasicLine();
    }
}