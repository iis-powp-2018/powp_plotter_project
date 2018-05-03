package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.kis.powp.drawer.shape.LineFactory;

public class DottedLinePlotterAdapter extends PlotterDefaultAdapter implements IPlotter
{ 

    public DottedLinePlotterAdapter() {
		super();
	}

    @Override
    public void drawTo(int x, int y) {
        line = LineFactory.getDottedLine();
    	super.drawTo(x, y);
    }
 
}
