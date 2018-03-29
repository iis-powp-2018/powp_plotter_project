package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.iis.powp.factory.*;

public class SelectCustomShapeListener implements ActionListener {
	
	@Override
    public void actionPerformed(ActionEvent e) {
		
		
		DrawPanelController controller = Application.getComponent(DrawPanelController.class);
		controller.clearPanel();
		if(e.getActionCommand().toString().equals("Rectangle")) {
    		controller.clearPanel();
    		FactoryRectangle.createRectangle(-100, 80, 200, 200).execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
    	}
		if(e.getActionCommand().toString().equals("Right Triangle")) {
			controller.clearPanel();
    		FactoryRightTriangle.createRectangle(-100, 80, 200, 200).execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
		}
	}
}
