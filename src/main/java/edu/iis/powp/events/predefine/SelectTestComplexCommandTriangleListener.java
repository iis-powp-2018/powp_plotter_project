package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.CommandFactory;
import edu.iis.powp.command.ComplexCommand;

public class SelectTestComplexCommandTriangleListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        ComplexCommand complexCommand = CommandFactory.drawTriangle();

        complexCommand.execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
    }

}
