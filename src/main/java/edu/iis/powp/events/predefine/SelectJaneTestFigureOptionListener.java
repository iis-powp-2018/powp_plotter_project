package edu.iis.powp.events.predefine;

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
        AbstractPlotterAdapter plotterAdapter = new AbstractPlotterAdapter(Application.getComponent(DriverManager.class).getCurrentPlotter());
        FiguresJane.figureScript(plotterAdapter);
    }
}
