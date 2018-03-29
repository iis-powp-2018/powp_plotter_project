package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.builder.ComplexCommandBuilder;
import edu.iis.powp.command.PlotterCommand;

public class PlotterCommandAdapter implements IPlotter, PlotterCommand {
    ComplexCommandBuilder builder = new ComplexCommandBuilder();

    @Override
    public void setPosition(int i, int i1) {
        builder.addSetPositionCommand(i, i1);
    }

    @Override
    public void drawTo(int i, int i1) {
        builder.addDrawToCommand(i, i1);
    }

    @Override
    public void execute(IPlotter plotter) {
        PlotterCommand command = builder.build();
        if(command != null) {
            command.execute(plotter);
        }
    }
}
