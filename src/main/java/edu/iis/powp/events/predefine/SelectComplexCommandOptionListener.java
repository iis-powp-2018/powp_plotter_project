package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.ComplexCommand;
import edu.iis.powp.factory.RectangleFactory;

public class SelectComplexCommandOptionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {

		String command = e.getActionCommand();
		if(command.equals("Rectangle"))
			RectangleFactory.createRectangle(-50, -50, 30, 120).execute(Application.getComponent(DriverManager.class).getCurrentPlotter());

	}

}
