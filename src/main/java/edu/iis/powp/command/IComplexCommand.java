package edu.iis.powp.command;

import java.util.Iterator;

public interface IComplexCommand extends  IPlotterCommand {

    public Iterator<IPlotterCommand> iterator();
}
