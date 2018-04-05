package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.ComplexCommand;
import edu.iis.powp.factory.FigureFactory;


public class SelectComplexCommandOptionListener implements ActionListener
{

    private int figureType = 0;

    public SelectComplexCommandOptionListener(int figureType)
    {
        this.figureType = figureType;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        ComplexCommand cc;
        switch(figureType)
        {
            case 1:
                cc = FigureFactory.square();
                cc.execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
                break;
            case 2:
                cc = FigureFactory.star();
                cc.execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
                break;
            default:
                cc = FigureFactory.triangle();
                cc.execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
                break;
        }

    }
}
