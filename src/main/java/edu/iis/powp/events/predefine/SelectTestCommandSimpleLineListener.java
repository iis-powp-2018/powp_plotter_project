package edu.iis.powp.events.predefine;

import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    import edu.iis.powp.command.CommandDrawLineToPosition;
/**
 *
 * @author karko
 */
public class SelectTestCommandSimpleLineListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        CommandDrawLineToPosition commandDrawLineToPosition = new CommandDrawLineToPosition(1,100);
        commandDrawLineToPosition.execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
    }
    
}
