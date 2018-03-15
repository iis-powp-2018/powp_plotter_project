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
public interface IPlotterCommand {
    public void execute(IPlotter plotter);
}
