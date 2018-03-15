package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

//wzorzec jest uzyty tu tez kompozyt 
public interface PlotterCommand {
    void execute(IPlotter plotter); 
}
