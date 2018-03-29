package edu.iis.powp.events.predefine;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.PlotterCommand;
import edu.iis.powp.factory.RightTriangleFactory;
import edu.iis.powp.factory.ShapeFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectDrawRightTriangleOptionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        IPlotter plotter = Application.getComponent(DriverManager.class).getCurrentPlotter();
        ShapeFactory shapeFactory = new RightTriangleFactory(50, 50, 10, -50);
        PlotterCommand plotterCommand = shapeFactory.createShape();
        plotterCommand.execute(plotter);
    }
}
