package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;

public class SelectTestFigureOptionListener implements ActionListener
{

    private int figureType = 0;

    public SelectTestFigureOptionListener(int figureType)
    {
        this.figureType = figureType;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        switch(figureType)
        {
            case 1:
                FiguresJoe.figureScript1(Application.getComponent(DriverManager.class).getCurrentPlotter());
                break;
            default:
                FiguresJoe.figureScript2(Application.getComponent(DriverManager.class).getCurrentPlotter());
                break;

        }

    }
}
