package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.AbstractPlotter;
import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.appext.ApplicationWithDrawer;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;

import java.util.logging.Logger;


public class SpecialLinePlotterAdapter extends AbstractPlotter implements IPlotter
{
    private ILine line = LineFactory.getBasicLine();
    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public SpecialLinePlotterAdapter(int x, int y) {
        super(x,y);
    }

    @Override
    public void drawTo(int x, int y) {
    	line.setStartCoordinates(this.getX(), this.getY());
        line.setEndCoordinates(x, y);
        this.setPosition(x,y);

        ApplicationWithDrawer.getDrawPanelController().drawLine(line);
    }

    @Override
    public String toString() {
        return "Special Line Plotter Simulator";
    }

    public void setBasicLineType(){
        line = LineFactory.getBasicLine();
        LOGGER.info("Using Basic Line Type");
    }

    public void setSpecialLineType(){
        line = LineFactory.getSpecialLine();
        LOGGER.info("Using Special Line Type");
    }

    public void setDottedLineType(){
        line = LineFactory.getDottedLine();
        LOGGER.info("Using Dotted Line Type");
    }
}
