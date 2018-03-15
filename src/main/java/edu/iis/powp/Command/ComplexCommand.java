package edu.iis.powp.Command;

import java.util.ArrayList;
import java.util.Iterator;

import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand extends ArrayList<IPlotterCommand> implements IPlotterCommand {


    @Override
    public void execute(IPlotter plotter) {
        for (IPlotterCommand element : this) {
            element.equals(element);
        }

    }

}