package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements PlotterCommand {

    private List<PlotterCommand> plotterCommands;

    public ComplexCommand() {
        plotterCommands = new ArrayList<>();
    }

    public ComplexCommand(List<PlotterCommand> plotterCommands) {
        this.plotterCommands = plotterCommands;
    }

    public void addCommand(PlotterCommand command){
        plotterCommands.add(command);
    }

    public void  addCommand(PlotterCommand command, int index){
        plotterCommands.add(index, command);
    }

    @Override
    public void execute(IPlotter plotter) {
        plotterCommands.forEach(plotterCommand -> plotterCommand.execute(plotter));
    }
}
