package edu.iis.powp.events.predefine;

import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.CommandComplex;
import edu.iis.powp.command.FigureCommandFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectCommandComplexRectangleListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e)
    {
        CommandComplex commandComplex = FigureCommandFactory.drawRectangle();

        commandComplex.execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
    }

}

