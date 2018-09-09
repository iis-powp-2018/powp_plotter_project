package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

import java.util.ArrayList;

public class ComplexCommand implements IPlotterCommand{

    private  ArrayList<IPlotterCommand> commands;

    public ComplexCommand() {
        commands = new ArrayList<>();
    }

    public void add(IPlotterCommand command)
    {
        commands.add(command);
    }

    @Override
    public void execute(IPlotter plotter)
    {

        for (IPlotterCommand command : commands)
        {
            command.execute(plotter);
        }

    }


}
