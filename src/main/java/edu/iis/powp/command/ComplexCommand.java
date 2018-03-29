package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

import java.util.ArrayList;

public class ComplexCommand implements PlotterCommand{

    private ArrayList<PlotterCommand> commandArrayList = new ArrayList<>();

    public void addCommand(PlotterCommand plotterCommand){
        commandArrayList.add(plotterCommand);
    }

    @Override
    public void execute(IPlotter plotter) {
        for(PlotterCommand a : commandArrayList){
            a.execute(plotter);
        }
    }
}
