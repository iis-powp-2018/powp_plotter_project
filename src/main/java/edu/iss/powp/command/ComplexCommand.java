package edu.iss.powp.command;

import java.util.Vector;

import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand implements PlotterCommand {

    Vector<PlotterCommand> vectorOfCommands = new Vector<>();

    public void addCommand(PlotterCommand command) {
        vectorOfCommands.addElement(command);
    }

    @Override
    public void execute(IPlotter plotter) {
        for (PlotterCommand command : vectorOfCommands) {
            command.execute(plotter);
        }

    }

}
