package edu.iis.powp.Command;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand extends ArrayList<IPlotterCommand> implements IPlotterCommand {


    public ComplexCommand(List<IPlotterCommand> commands) {

    }

    @Override
    public void execute(IPlotter plotter) {
        for (IPlotterCommand element : this) {
            element.equals(element);
        }

    }

}