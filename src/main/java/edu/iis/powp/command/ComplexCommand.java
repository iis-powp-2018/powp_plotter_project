package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

import java.util.List;

public class ComplexCommand implements PlotterCommand {
    private List<PlotterCommand> plotterCommands;

    public ComplexCommand(List<PlotterCommand> plotterCommands) {
        this.plotterCommands = plotterCommands;
    }

    @Override
    public void execute(IPlotter plotter) {
        for (PlotterCommand plotterCommand : plotterCommands) {
            plotterCommand.execute(plotter);
        }
    }
}
