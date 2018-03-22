package edu.iis.powp.events.predefine;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.CommandSetPosition;
import edu.iis.powp.command.PlotterCommand;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectSetPositionOneOptionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        IPlotter plotter = Application.getComponent(DriverManager.class).getCurrentPlotter();
        PlotterCommand command = new CommandSetPosition(0, 0);
        command.execute(plotter);
    }
}
