package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.client.plottermagic.preset.FiguresJane;
import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.adapter.PlotterAdapter;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.FigureCreator;

public class SelectTestFigureOptionListener implements ActionListener
{
    private int numberTest;
    private IPlotter plotter;

    public SelectTestFigureOptionListener(int numberTest){
        this.numberTest=numberTest;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        plotter = Application.getComponent(DriverManager.class).getCurrentPlotter();
        if (numberTest==1)
            FiguresJoe.figureScript1(plotter);
        else if(numberTest==2)
            FiguresJoe.figureScript2(plotter);
        else if (numberTest==3)
            FigureCreator.SquareScript(plotter);
        else if (numberTest==5)
            FigureCreator.CircleScript(plotter);
        else if (numberTest==4)
            FiguresJane.figureScript(new PlotterAdapter(plotter));
        else if (numberTest==6)
            FigureCreator.CombinedScript(plotter);
    }
}