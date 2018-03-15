package edu.iis.powp.events.predefine;

import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.CommandComplex;
import edu.iis.powp.command.FigureCommandFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectCommandComplexCircleListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e)
    {
        CommandComplex commandComplex = FigureCommandFactory.drawCircle();

        commandComplex.execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
    }

}
