package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;


import java.util.List;

public class CommandComplex implements PlotterCommand {

    private List<PlotterCommand> commands;

    public CommandComplex(List<PlotterCommand> plotterCommand) {
       commands = plotterCommand;
    }

    @Override
    public void execute(IPlotter plotter) {

        for (PlotterCommand plotterCommand : commands) {
            plotterCommand.execute(plotter);
        }
    }
}
