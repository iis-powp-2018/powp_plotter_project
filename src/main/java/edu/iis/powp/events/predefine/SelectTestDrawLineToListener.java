package edu.iis.powp.events.predefine;

import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.CommandDrawLineToPosition;
import edu.iis.powp.command.PlotterCommand;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestDrawLineToListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        PlotterCommand command = new CommandDrawLineToPosition(50, 20);
        command.execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
    }
}
