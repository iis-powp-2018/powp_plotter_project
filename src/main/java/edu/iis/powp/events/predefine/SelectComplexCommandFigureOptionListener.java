package edu.iis.powp.events.predefine;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.CommandDrawLineToPosition;
import edu.iis.powp.command.CommandSetPosition;
import edu.iis.powp.command.ComplexCommand;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectComplexCommandFigureOptionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        IPlotter plotter = Application.getComponent(DriverManager.class).getCurrentPlotter();
        ComplexCommand command = new ComplexCommand();

        int width = 50, height = 100, startX = 0, startY = 0;
        command.addPlotterCommand(new CommandSetPosition(startX, startY));
        command.addPlotterCommand(new CommandDrawLineToPosition(width, startY));
        command.addPlotterCommand(new CommandDrawLineToPosition(width, height));
        command.addPlotterCommand(new CommandDrawLineToPosition(startX, height));
        command.addPlotterCommand(new CommandDrawLineToPosition(startX, startY));

        command.execute(plotter);
    }
}
