package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;

public class SelectTestFigureOptionListener implements ActionListener
{
    private String testName;

    public  SelectTestFigureOptionListener(String testName){
        this.testName = testName;
    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        switch (testName){
            case "Figure Joe 1":
                FiguresJoe.figureScript1(Application.getComponent(DriverManager.class).getCurrentPlotter());
                break;
            case "Figure Joe 2":
                FiguresJoe.figureScript2(Application.getComponent(DriverManager.class).getCurrentPlotter());
                break;
            default:
                FiguresJoe.figureScript1(Application.getComponent(DriverManager.class).getCurrentPlotter());
                break;
        }
        //FiguresJoe.figureScript1(Application.getComponent(DriverManager.class).getCurrentPlotter());
    }
}
