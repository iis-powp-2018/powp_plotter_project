package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.AbstractPlotter;
import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.app.DriverManager;
import javafx.application.Application;

public class AbstractPloterAdapter extends AbstractPlotter {

    public AbstractPloterAdapter(int x, int y) {
        super(x, y);
    }

    @Override
    public void drawTo(int i, int i1) {
        IPlotter iPlotter = edu.iis.powp.app.Application.getComponent(DriverManager.class).getCurrentPlotter();
        iPlotter.drawTo(i, i1);
    }


}
