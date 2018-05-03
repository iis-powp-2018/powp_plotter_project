/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iss.powp.command;

import edu.iis.client.plottermagic.IPlotter;
import java.util.List;

/**
 *
 * @author Gość
 */
public class ComplexCommand implements PlotterCommand {     

    private List <PlotterCommand> commandsList;

    ComplexCommand ( List <PlotterCommand> commandsList) {
        this.commandsList = commandsList;
    }
    @Override
    public void execute(IPlotter plotter) {
        for ( PlotterCommand actualCommand: commandsList) {
            actualCommand.execute(plotter);
        }
    }
 
    
}
