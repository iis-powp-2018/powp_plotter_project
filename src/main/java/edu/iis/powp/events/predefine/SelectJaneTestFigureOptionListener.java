package edu.iis.powp.events.predefine;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.client.plottermagic.preset.FiguresJane;
import edu.iis.powp.adapter.AbstractPlotterAdapter;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectJaneTestFigureOptionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e)
    {
        IPlotter plotter = Application.getComponent(DriverManager.class).getCurrentPlotter();
        AbstractPlotterAdapter abstractPlotter = new AbstractPlotterAdapter(0, 0);
        abstractPlotter.attachRealPlotter(plotter);
        FiguresJane.figureScript(abstractPlotter);
    }
}
