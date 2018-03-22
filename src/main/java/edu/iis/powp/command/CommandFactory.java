/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iis.powp.command;

import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;

/**
 *
 * @author karko
 */
public class CommandFactory {
    
    public static IPlotterCommand drawSquare(){
        ComplexCommand complexCommand = new ComplexCommand();
        
        CommandDrawLineToPosition commandDrawLineToPosition = new CommandDrawLineToPosition(20,0);
        CommandDrawLineToPosition commandDrawLineToPosition1 = new CommandDrawLineToPosition(20,20);
        CommandDrawLineToPosition commandDrawLineToPosition2 = new CommandDrawLineToPosition(0,20);
        CommandDrawLineToPosition commandDrawLineToPosition3 = new CommandDrawLineToPosition(0,0);
        
        complexCommand.addCommand(Application.getComponent(DriverManager.class).getCurrentPlotter(),
                commandDrawLineToPosition);
        complexCommand.addCommand(Application.getComponent(DriverManager.class).getCurrentPlotter(),
                commandDrawLineToPosition1);
        complexCommand.addCommand(Application.getComponent(DriverManager.class).getCurrentPlotter(),
                commandDrawLineToPosition2);
        complexCommand.addCommand(Application.getComponent(DriverManager.class).getCurrentPlotter(),
                commandDrawLineToPosition3);
        return complexCommand;
    }
    
    public static IPlotterCommand drawRectangle(){
        ComplexCommand complexCommand = new ComplexCommand();
        
        CommandDrawLineToPosition commandDrawLineToPosition = new CommandDrawLineToPosition(20,0);
        CommandDrawLineToPosition commandDrawLineToPosition1 = new CommandDrawLineToPosition(20,200);
        CommandDrawLineToPosition commandDrawLineToPosition2 = new CommandDrawLineToPosition(0,200);
        CommandDrawLineToPosition commandDrawLineToPosition3 = new CommandDrawLineToPosition(0,0);
        
        complexCommand.addCommand(Application.getComponent(DriverManager.class).getCurrentPlotter(),
                commandDrawLineToPosition);
        complexCommand.addCommand(Application.getComponent(DriverManager.class).getCurrentPlotter(),
                commandDrawLineToPosition1);
        complexCommand.addCommand(Application.getComponent(DriverManager.class).getCurrentPlotter(),
                commandDrawLineToPosition2);
        complexCommand.addCommand(Application.getComponent(DriverManager.class).getCurrentPlotter(),
                commandDrawLineToPosition3);
        return complexCommand;
    }
    
}
