package edu.iis.powp.events.predefine;

import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.RectangleFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestRectangleOptionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        RectangleFactory.createRectangle(-50, -50, 30, 120).execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
    }
}
