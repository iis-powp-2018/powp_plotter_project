package edu.iis.powp.command;

import edu.iis.powp.app.Application;
import edu.iis.powp.factory.Pattern;
import edu.iis.powp.factory.PatternFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import edu.iis.powp.app.DriverManager;

public class RectangleCommandTestListener implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {

        Pattern pattern = PatternFactory.getSquarePattern();
        pattern.draw(Application.getComponent(DriverManager.class).getCurrentPlotter());
    }
}
