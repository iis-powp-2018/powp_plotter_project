package edu.iis.powp.events.predefine;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.CommandDrawLineToPosition;
import edu.iis.powp.command.CommandSetPosition;
import edu.iis.powp.command.ComplexCommand;
import edu.iis.powp.command.PlotterCommand;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SelectTestComplexCommandListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        ArrayList<PlotterCommand> commands = new ArrayList<>();
        commands.add(new CommandDrawLineToPosition(100, 100));
        commands.add(new CommandDrawLineToPosition(-100,-200));
        commands.add(new CommandSetPosition(0, 100));
        commands.add(new CommandDrawLineToPosition(200, -50));
        PlotterCommand command = new ComplexCommand(commands);
        command.execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
    }
}
