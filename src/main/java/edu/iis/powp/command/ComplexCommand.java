package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

import java.util.LinkedList;
import java.util.List;

public class ComplexCommand implements PlotterCommand  {
    private List<PlotterCommand> commandList;

    public ComplexCommand() {
        commandList = new LinkedList<>();
    }

    public boolean addPlotterCommand(PlotterCommand command) {
        return commandList.add(command);
    }

    public boolean addPlotterCommands(List<PlotterCommand> commands) {
        return commandList.addAll(commands);
    }

    public void addPlotterCommand(PlotterCommand command, int position) {
        commandList.add(position, command);
    }

    public boolean removePlotterCommand(PlotterCommand command) {
        return commandList.remove(command);
    }

    public PlotterCommand removePlotterCommand(int position) {
        return commandList.remove(position);
    }

    public void clearCommandsList() {
        commandList.clear();
    }

    @Override
    public void execute(IPlotter plotter) {
        for(PlotterCommand command : commandList) {
            command.execute(plotter);
        }
    }
}
