package edu.iis.powp.events.predefine;

import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.TriangleFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestTriangleOptionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        TriangleFactory.createTriangle(-200, 50, 20, 20, 70, - 40).execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
    }
}
