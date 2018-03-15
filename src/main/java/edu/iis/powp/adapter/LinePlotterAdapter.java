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
	public ILine line = LineFactory.getBasicLine();
	
    public LinePlotterAdapter(ILine type) {
		super();
		this.line=type;
	}
    
    public void setLine(ILine bline) {
    	this.line=bline;
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
        ILine drawline = line;
        drawline.setStartCoordinates(this.startX, this.startY);
        drawline.setEndCoordinates(x, y);
        setPosition(x,y);

		ApplicationWithDrawer.getDrawPanelController().drawLine(drawline);
    }

    @Override
    public String toString()
    {
    	if(line.equals(LineFactory.getBasicLine())) {
    		return "Solid Line";	
    	}
    	else if(line.equals(LineFactory.getDottedLine())){
    		return "Dotted Line";
    	}
    	else {
    		return "Special Line";
    	}
        
    }
}
