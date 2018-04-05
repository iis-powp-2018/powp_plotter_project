package edu.iis.powp.events.predefine;

import edu.iis.powp.Factories.RectangleFactory;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.ComplexCommand;
import edu.kis.powp.drawer.panel.DrawPanelController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectRectangleListener implements ActionListener{

    @Override public void actionPerformed(ActionEvent e) {
        DrawPanelController controller = Application.getComponent(DrawPanelController.class);
        System.out.println(e.getActionCommand().toString());
        controller.clearPanel();
        RectangleFactory.createRectangle(0,0,50,50).execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
    }
}
