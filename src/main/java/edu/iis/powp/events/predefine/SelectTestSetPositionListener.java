package edu.iis.powp.events.predefine;

import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.appext.ApplicationWithDrawer;
import edu.iis.powp.command.CommandSetPosition;
import edu.iis.powp.command.PlotterCommand;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestSetPositionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        PlotterCommand command = new CommandSetPosition(-20,-50);
        command.execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
    }
}
