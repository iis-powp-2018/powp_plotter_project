package edu.iis.powp.events.predefine;

import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.factory.TriangleFactory;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestTriangleListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        TriangleFactory.createTriangle(0,0,50).execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
    }
}