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
import edu.iis.powp.factory.FigureFactory;

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
        switch(index){
            case 1:
                FiguresJoe.figureScript1(Application.getComponent(DriverManager.class).getCurrentPlotter());
                break;
            case 2:
                FiguresJoe.figureScript2(Application.getComponent(DriverManager.class).getCurrentPlotter());
                break;
            case 3:
                FiguresJane.figureScript(plotter);
                LOGGER.info("Using Special Line Plotter Simulator");
                break;
            case 4:
                FigureFactory.drawRectangle().draw(Application.getComponent(DriverManager.class).getCurrentPlotter());
                break;
            case 5:
                FigureFactory.drawCircle().draw(Application.getComponent(DriverManager.class).getCurrentPlotter());
                break;
            case 6:
                FigureFactory.drawTriangle().draw(Application.getComponent(DriverManager.class).getCurrentPlotter());
                break;
            case 7:
                FigureFactory.drawConnectedJoe().draw(Application.getComponent(DriverManager.class).getCurrentPlotter());
                break;
        }

    }
}
