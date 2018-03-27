package edu.iis.powp.events.predefine;

import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.PlotterCommand;
import edu.iis.powp.factory.RectangleFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestRectangleListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e)
    {
        RectangleFactory.createRectangle(0,0,50,200).execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
    }
}