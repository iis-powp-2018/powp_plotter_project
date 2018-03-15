package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

import java.util.ArrayList;

public class CommandComplex implements PlotterCommand {
    ArrayList<PlotterCommand> commands = new ArrayList<>();

    public void addCommand(PlotterCommand command){
        commands.add(command);
    }

    @Override
    public void execute(IPlotter plotter) {
        for(PlotterCommand command : commands){
            command.execute(plotter);
        }
    }
}
