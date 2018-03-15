package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Logger;

import edu.iis.client.plottermagic.AbstractPlotter;
import edu.iis.client.plottermagic.IPlotter;
import edu.iis.client.plottermagic.preset.FiguresJane;
import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;

public class SelectTestFigureOptionListener implements ActionListener
{
    private int index;
    private AbstractPlotter plotter;
    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public SelectTestFigureOptionListener(int index) {
        this.index = index;
    }

    public SelectTestFigureOptionListener(int index, IPlotter usedPlotter){
        this.index = index;
        this.plotter = (AbstractPlotter)usedPlotter;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(index == 1)
            FiguresJoe.figureScript1(Application.getComponent(DriverManager.class).getCurrentPlotter());
        else if(index == 2)
            FiguresJoe.figureScript2(Application.getComponent(DriverManager.class).getCurrentPlotter());
        else {
            FiguresJane.figureScript(plotter);
            LOGGER.info("Using Special Line Plotter Simulator");
        }
    }
}
