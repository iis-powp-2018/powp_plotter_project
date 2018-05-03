package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;

public class LinePlotterAdapter extends PlotterDefaultAdapter implements IPlotter
{ 
	
    public LinePlotterAdapter() {
	super();
    }

    @Override
    public void drawTo(int x, int y) {
        line = LineFactory.getSpecialLine();
    	super.drawTo(x, y);
    }
}
