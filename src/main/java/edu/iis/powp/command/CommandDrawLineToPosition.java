/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;
/**
 *
 * @author karko
 */
public class CommandDrawLineToPosition implements IPlotterCommand{

    private int i, i1;
    
    public CommandDrawLineToPosition(int i, int i1) {
        this.i = i;
        this.i1 = i1;
    }

    @Override
    public void execute(IPlotter plotter) {
        plotter.drawTo(i, i1);
    }
}
