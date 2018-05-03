package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.appext.ApplicationWithDrawer;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;

public class PlotterDefaultAdapter extends DrawPanelController implements IPlotter
{ 
    protected int startX, startY;
    protected ILine line;
    
    public PlotterDefaultAdapter() {
            super();
            startX = 0;
            startY = 0;
	}
    
    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void drawTo(int x, int y) {
        
        if ( line != null )
        {   
            line.setStartCoordinates(this.startX, this.startY);
            line.setEndCoordinates(x, y);
            setPosition(x,y);
            ApplicationWithDrawer.getDrawPanelController().drawLine(line);
        }
    }

    @Override
    public String toString() {
        return "@Q!$!@$!#@$(*#@&Q(%^*#@";
    }
 
}
