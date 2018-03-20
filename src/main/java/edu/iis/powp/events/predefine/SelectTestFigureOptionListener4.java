package edu.iis.powp.events.predefine;

import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.ComplexCommandFactory;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestFigureOptionListener4 implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        ComplexCommandFactory.createTriangle(2,2,2,150,150,75).execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
    }
}
