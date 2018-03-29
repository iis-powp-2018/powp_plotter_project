package edu.iis.powp.events.predefine;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.adapter.PlotterCommandAdapter;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectDrawFigureJoeOneUsingPlotterCommandOptionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        PlotterCommandAdapter plotterCommandAdapter = new PlotterCommandAdapter();
        IPlotter plotter = Application.getComponent(DriverManager.class).getCurrentPlotter();

        FiguresJoe.figureScript1(plotterCommandAdapter);
        plotterCommandAdapter.execute(plotter);
    }
}
