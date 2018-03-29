package edu.iis.powp.builder;

import edu.iis.powp.command.CommandDrawLineToPosition;
import edu.iis.powp.command.CommandSetPosition;
import edu.iis.powp.command.ComplexCommand;
import edu.iis.powp.command.PlotterCommand;

public class ComplexCommandBuilder {
    private ComplexCommand command = new ComplexCommand();

    public void addCommand(PlotterCommand command) {
        this.command.addPlotterCommand(command);
    }

    public void addSetPositionCommand(int x, int y) {
        PlotterCommand setPosition = new CommandSetPosition(x, y);
        addCommand(setPosition);
    }

    public void addDrawToCommand(int x, int y) {
        PlotterCommand drawTo = new CommandDrawLineToPosition(x, y);
        addCommand(drawTo);
    }

    public ComplexCommand build() {
        ComplexCommand result = null;

        try {
            result = (ComplexCommand) command.clone();
        } catch (CloneNotSupportedException ignored) {
        }

        return result;
    }
}
