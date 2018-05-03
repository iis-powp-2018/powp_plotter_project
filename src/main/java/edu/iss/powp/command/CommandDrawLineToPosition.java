/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iss.powp.command;

import edu.iis.client.plottermagic.IPlotter;

/**
 *
 * @author Gość
 */
public class CommandDrawLineToPosition implements PlotterCommand {

    private int x, y;

    public CommandDrawLineToPosition (int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    @Override
    public void execute(IPlotter plotter) {
        plotter.drawTo(x,y);
    }
    
}
