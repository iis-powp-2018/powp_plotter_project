package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements PlotterCommand {

    private List<PlotterCommand> commands = new ArrayList<>();

    @Override
    public void execute(IPlotter plotter) {
        commands.forEach(command -> command.execute(plotter));
    }

    public void setCommand(PlotterCommand command){
        commands.add(command);
    }
}
