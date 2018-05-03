package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.kis.powp.drawer.shape.LineFactory;

public class BasicLinePlotterAdapter extends PlotterDefaultAdapter implements IPlotter
{ 

    public BasicLinePlotterAdapter() {
		super();
	}

    @Override
    public void drawTo(int x, int y) {
        line = LineFactory.getBasicLine();
    	super.drawTo(x, y);
    }
 
}
