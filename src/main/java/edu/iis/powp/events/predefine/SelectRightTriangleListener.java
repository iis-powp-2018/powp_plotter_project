package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.ComplexCommand;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.iis.powp.factories.*;

public class SelectRightTriangleListener implements ActionListener {	

	@Override
    public void actionPerformed(ActionEvent e) {
		DrawPanelController controller = Application.getComponent(DrawPanelController.class);
		System.out.println(e.getActionCommand().toString());
		controller.clearPanel();
		RightTriangleFactory.createRectangle(0, 0, 100, 100).execute(Application.getComponent(DriverManager.class).getCurrentPlotter());		
    }
}
