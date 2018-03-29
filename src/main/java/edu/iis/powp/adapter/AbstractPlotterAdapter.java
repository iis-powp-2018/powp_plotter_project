package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.AbstractPlotter;
import edu.iis.client.plottermagic.IPlotter;

public class AbstractPlotterAdapter extends AbstractPlotter {
    private IPlotter plotter;

    public AbstractPlotterAdapter(int x, int y) {
        super(x, y);
    }

    public void attachRealPlotter(IPlotter plotter) {
        this.plotter = plotter;
        this.plotter.setPosition(getX(), getY());
    }

    @Override
    public void drawTo(int i, int i1) {
        if(this.plotter != null) {
            this.plotter.setPosition(getX(), getY());
            this.plotter.drawTo(i, i1);
            setPosition(i, i1);
        }
    }
}
