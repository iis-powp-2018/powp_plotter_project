package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iss.powp.command.ComplexCommand;

public class SelectComplexCommandTestListener implements ActionListener{
	@Override
    public void actionPerformed(ActionEvent e)
    {
		ComplexCommand Complexcommand = new ComplexCommand(-100, 0, 100, 0);

		Complexcommand.execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
    }
}