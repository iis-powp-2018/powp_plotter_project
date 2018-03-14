package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.client.plottermagic.AbstractPlotter;
import edu.iis.client.plottermagic.preset.FiguresJane;
import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.adapter.MyAdapter;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;

public class SelectTestFigureOptionListener implements ActionListener
{
    private int numberTest;
    private AbstractPlotter plotter;

    public SelectTestFigureOptionListener (AbstractPlotter plotter){
        this.plotter=plotter;
    }
    public SelectTestFigureOptionListener(int numberTest){
        this.numberTest=numberTest;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (numberTest==1)
            FiguresJoe.figureScript1(Application.getComponent(DriverManager.class).getCurrentPlotter());
        else if(numberTest==2)
            FiguresJoe.figureScript2(Application.getComponent(DriverManager.class).getCurrentPlotter());
        else
            FiguresJane.figureScript(plotter);
    }
}