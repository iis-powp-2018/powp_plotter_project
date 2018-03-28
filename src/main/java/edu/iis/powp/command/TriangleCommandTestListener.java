package edu.iis.powp.command;

import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.factory.Pattern;
import edu.iis.powp.factory.PatternFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TriangleCommandTestListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        Pattern pattern = PatternFactory.getTrianglePattern();
        pattern.draw(Application.getComponent(DriverManager.class).getCurrentPlotter());
    }
}
