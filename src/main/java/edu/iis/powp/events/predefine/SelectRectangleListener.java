package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.factories.*;

public class SelectRectangleListener implements ActionListener {
	
	@Override
    public void actionPerformed(ActionEvent e)
    {
		RectangleFactory.createRectangle(0, 0, 100, 100).execute(Application.getComponent(DriverManager.class).getCurrentPlotter());;
    }
}
