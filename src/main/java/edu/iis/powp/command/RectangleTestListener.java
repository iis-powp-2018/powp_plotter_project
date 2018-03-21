package edu.iis.powp.command;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;

public class RectangleTestListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		RectangleFactory.createRectangle(0, 0, 200, 100).execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
		
	}

}
