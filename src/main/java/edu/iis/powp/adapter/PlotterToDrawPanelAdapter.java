package edu.iis.powp.adapter;

import javax.swing.JPanel;

import edu.iis.client.plottermagic.IPlotter;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;


/**
 * Plotter adapter to drawer with several bugs. 
 */
public class PlotterToDrawPanelAdapter implements IPlotter
{ 
	private DrawPanelController drawPanelController;
	
	private int startX = 0, startY = 0;
	
    public PlotterToDrawPanelAdapter(DrawPanelController drawPanelController) {
		super();
		this.drawPanelController = drawPanelController;
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
        ILine line = LineFactory.getBasicLine();
    	line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);
        setPosition(x,y);
		drawLine(line);
    }
    

    private void drawLine(ILine line) {
    	drawPanelController.drawLine(line);
	}

	@Override
    public String toString()
    {
        return "Buggy Simulator";
    }
}
