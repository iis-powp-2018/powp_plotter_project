package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.ComplexCommandRectangle;

public class SelectTestFigureOptionComplexCommand implements ActionListener
{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		ComplexCommandRectangle.getSquare().execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
	}	
}