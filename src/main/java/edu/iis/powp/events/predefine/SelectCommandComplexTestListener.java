package edu.iis.powp.events.predefine;

import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.CommandComplex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectCommandComplexTestListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e)
    {
        CommandComplex commandComplex = new CommandComplex(0, 0, 100, 130);

        commandComplex.execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
    }

}

