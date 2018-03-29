package edu.iis.powp.events.predefine;

import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.PlotterCommand;
import edu.iis.powp.factory.RectangleFactory;
import edu.iis.powp.factory.ShapeFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestRectangleListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        ShapeFactory factory = new RectangleFactory();
        PlotterCommand command = factory.createShapeCommand();
        command.execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
    }
}
