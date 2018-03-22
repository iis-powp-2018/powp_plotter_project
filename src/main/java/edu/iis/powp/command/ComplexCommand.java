/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author karko
 */
public class ComplexCommand implements IPlotterCommand {
    
    private int i, i1;
    private ArrayList<IPlotterCommand> commandList = new ArrayList<IPlotterCommand>();

    public ComplexCommand() {
        this.i = i;
        this.i1 = i1; 
    }
    
    public void addCommand(IPlotter plotter, IPlotterCommand command){
        commandList.add(command);
    }
    
    @Override
    public void execute(IPlotter plotter) {
        
        for (IPlotterCommand command : commandList){
            command.execute(plotter);
        }
    }    
}
