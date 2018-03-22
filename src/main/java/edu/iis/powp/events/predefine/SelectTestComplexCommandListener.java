/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iis.powp.events.predefine;

import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.CommandDrawLineToPosition;
import edu.iis.powp.command.CommandSetPosition;
import edu.iis.powp.command.ComplexCommand;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author karko
 */
public class SelectTestComplexCommandListener implements ActionListener{
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        ComplexCommand complexCommand = new ComplexCommand();
        
        CommandDrawLineToPosition commandDrawLineToPosition = new CommandDrawLineToPosition(20,0);
        CommandDrawLineToPosition commandDrawLineToPosition1 = new CommandDrawLineToPosition(20,20);
        CommandSetPosition commandSetPosition1 = new CommandSetPosition(0,-20);
        CommandDrawLineToPosition commandDrawLineToPosition2 = new CommandDrawLineToPosition(0,20);
        
        complexCommand.addCommand(Application.getComponent(DriverManager.class).getCurrentPlotter(),
                commandDrawLineToPosition);
        complexCommand.addCommand(Application.getComponent(DriverManager.class).getCurrentPlotter(),
                commandDrawLineToPosition1);
        complexCommand.addCommand(Application.getComponent(DriverManager.class).getCurrentPlotter(),
                commandSetPosition1);
        complexCommand.addCommand(Application.getComponent(DriverManager.class).getCurrentPlotter(),
                commandDrawLineToPosition2);
        
        complexCommand.execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
    }
    
}
