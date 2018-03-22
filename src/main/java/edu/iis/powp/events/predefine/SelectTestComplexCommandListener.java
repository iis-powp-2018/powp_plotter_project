package edu.iis.powp.events.predefine;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.ComplexCommand;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestComplexCommandListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        ComplexCommand complexCommand = new ComplexCommand(20,40);
        complexCommand.execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
    }
}
