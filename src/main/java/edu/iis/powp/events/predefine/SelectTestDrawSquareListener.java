/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iis.powp.events.predefine;

import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.CommandFactory;
import edu.iis.powp.command.ComplexCommand;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author karko
 */
public class SelectTestDrawSquareListener implements ActionListener{
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        ComplexCommand drawSquare = (ComplexCommand) CommandFactory.drawSquare();
        drawSquare.execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
    }
    
    
    
}
