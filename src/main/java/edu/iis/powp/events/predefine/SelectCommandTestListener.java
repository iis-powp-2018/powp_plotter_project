package edu.iis.powp.events.predefine;

import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.CommandDrawLineToPosition;
import edu.iis.powp.command.CommandSetPosition;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectCommandTestListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e)
    {
        CommandSetPosition commandSetPosition = new CommandSetPosition(0, 0);
        CommandDrawLineToPosition comandDrawLineToPosition = new CommandDrawLineToPosition(120, 150);

        commandSetPosition.execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
        comandDrawLineToPosition.execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
    }

}
