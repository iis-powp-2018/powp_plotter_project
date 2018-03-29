package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iss.powp.command.ComplexCommand;
import edu.iss.powp.command.ComplexShapeFactory;

public class SelectComplexCommandRectangleListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        ComplexCommand Complexcommand = ComplexShapeFactory.rectangle();

        Complexcommand.execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
    }
}
