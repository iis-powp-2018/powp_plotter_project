package edu.iis.powp.command;

import java.util.ArrayList;

import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand implements PlotterCommand {

    ArrayList<PlotterCommand> commandList = new ArrayList<>();

    public void addCommand(PlotterCommand command) {
        commandList.add(command);
    }

    @Override
    public void execute(IPlotter plotter) {

        for (PlotterCommand command : commandList) {
            command.execute(plotter);
        }

    }
}
