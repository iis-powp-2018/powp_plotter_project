package edu.iis.powp.events.predefine;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.ComplexCommand;
import edu.iis.powp.command.PlotterCommand;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectComplexCommandFigureOptionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        IPlotter plotter = Application.getComponent(DriverManager.class).getCurrentPlotter();
        PlotterCommand command = new ComplexCommand(50, 120);
        command.execute(plotter);
    }
}
