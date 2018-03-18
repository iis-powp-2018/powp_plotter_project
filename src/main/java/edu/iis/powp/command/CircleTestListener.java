package edu.iis.powp.command;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;

public class CircleTestListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		CircleFactory.createCircle(0, 0, 100).execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
		
	}
	
}
