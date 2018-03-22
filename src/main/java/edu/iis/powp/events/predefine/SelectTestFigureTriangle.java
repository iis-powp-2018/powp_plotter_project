package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.CommandsFactory;
import edu.iis.powp.command.ComplexCommand;

public class SelectTestFigureTriangle implements ActionListener{
	ComplexCommand triangleCommand = CommandsFactory.getTriangle();
	
	@Override
    public void actionPerformed(ActionEvent e) {
		triangleCommand.execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
    }
}
