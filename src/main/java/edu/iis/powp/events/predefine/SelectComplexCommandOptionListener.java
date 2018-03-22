package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.ComplexCommand;

public class SelectComplexCommandOptionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		ComplexCommand complexCommand = new ComplexCommand(0,0,0,50);
		complexCommand.execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
		
	}

}
