package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.AbstractPlotter;
import edu.iis.client.plottermagic.IPlotter;

public class PlotterAdapter extends AbstractPlotter
{
    int x = 0;
    int y = 0;

    private IPlotter iPlotter;

    public PlotterAdapter(IPlotter iPlotter){
        super(0,0);
        this.iPlotter = iPlotter;
    }

    @Override
    public void drawTo(int i, int i1) {
        if(getX()!=x || getX()!=y) {
            x = getX(); y = getY();
            iPlotter.setPosition(x, y);
            iPlotter.drawTo(i, i1);
        }
        else
            iPlotter.drawTo(i,i1);
    }
}
