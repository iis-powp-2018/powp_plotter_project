package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.ComplexCommand;
import edu.iis.powp.factory.RectangleFactory;
import edu.iis.powp.factory.TriangleFactory;

public class SelectComplexCommandOptionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {

		String command = e.getActionCommand();
		if(command.equals("Rectangle"))
			RectangleFactory.createRectangle(-50, -50, 50, 50).execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
		if(command.equals("Triangle"))
			TriangleFactory.createTriangle(-50, -50, 50, 50).execute(Application.getComponent(DriverManager.class).getCurrentPlotter());

	}

}
