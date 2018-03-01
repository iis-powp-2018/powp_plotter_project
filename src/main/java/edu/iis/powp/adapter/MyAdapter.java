package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.kis.powp.drawer.panel.DefaultDrawerFrame;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;
import javax.swing.*;

/**
 * Plotter adapter to drawer with several bugs. 
 */
public class MyAdapter extends DrawPanelController implements IPlotter
{ 
	private int startX = 0, startY = 0;
	
    public MyAdapter() {
		super();
		
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

        drawLine(line);
    }
    
    //@Override
//    public void initialize(JPanel drawArea)
  //  {
  //  	super.initialize(drawArea);
 //   }
    
    public void setHandle ( JPanel windowHandle )
    {
    
        this.drawArea = windowHandle;
    }
    
    @Override
    public void drawLine(final ILine line)
    {
    	try
    	{
    	//	drawArea.drawLine((ILine) line.clone());
		}
        
        catch ( Exception e )
    	{
			//printStackTrace();
		}
    	drawArea.repaint();
    }

    @Override
    public String toString()
    {
        return "@Q!$!@$!#@$(*#@&Q(%^*#@";
    }
    
    
    	private JPanel drawArea;
}
