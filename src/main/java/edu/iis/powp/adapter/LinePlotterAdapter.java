package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.appext.ApplicationWithDrawer;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;


public class LinePlotterAdapter extends DrawPanelController implements IPlotter 
{ 
		private int startX = 0, startY = 0;
		public ILine lineMain;
	    public LinePlotterAdapter(ILine lineType) {
			super();
	    	this.lineMain = lineType;
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
	    	ILine line = lineMain;
	    	line.setStartCoordinates(this.startX, this.startY);
	        line.setEndCoordinates(x, y);
	        setPosition(x,y);
	        ApplicationWithDrawer.getDrawPanelController().drawLine(line);
	    }

	    // W metodzie toString() nie umieściłem opcji "Client plotter 3.0 - Dotted Line - Color" ze względu na brak metody .isSpecial() / .isBasic() w LineFactory.
	    @Override
	    public String toString()
	    {
	    	if(lineMain.isDotted()) {
	    		return "Client plotter 3.0 - Dotted Line";
	    	} else {
	    		return "Client plotter 3.0 - Solid Line";
	    	}
	    }
}

