package edu.iis.powp.command;

import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TriangleTest implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        TriangleFactory.createTriangle(0,0,100,0,100,200).execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
    }
}
