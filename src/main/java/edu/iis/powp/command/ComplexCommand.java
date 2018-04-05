package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

import java.util.Iterator;
import java.util.List;

public class ComplexCommand implements PlotterCommand{

    private List<PlotterCommand> commandList;

    public ComplexCommand(List<PlotterCommand> commandList) {
        this.commandList = commandList;
    }

    public void addCommand(PlotterCommand command){
        this.commandList.add(command);
    }

    @Override
    public void execute(IPlotter iplotter){
        commandList.forEach(Command -> Command.execute(iplotter));
    }
}
