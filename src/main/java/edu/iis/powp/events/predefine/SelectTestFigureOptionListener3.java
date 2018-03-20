package edu.iis.powp.events.predefine;

import edu.iis.powp.Command.ComplexCommand;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.ComplexCommandFactory;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestFigureOptionListener3 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        ComplexCommandFactory.createSquare(50,50,100).execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
    }
}
