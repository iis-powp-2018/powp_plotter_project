package edu.iis.powp.events.predefine;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.CommandComplex;
import edu.iis.powp.command.CommandDrawLineToPosition;
import edu.iis.powp.command.CommandSetPosition;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SelectCommandSimpleTest implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        CommandSetPosition commandSetPosition = new CommandSetPosition(0,0);
        CommandDrawLineToPosition commandDrawLineToPosition = new CommandDrawLineToPosition(50,150);

        commandSetPosition.execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
        commandDrawLineToPosition.execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
    }
}
