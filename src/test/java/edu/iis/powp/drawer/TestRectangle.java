package edu.iis.powp.drawer;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.Command.ComplexCommandFactory;
import edu.iis.powp.Command.IPlotterCommand;
import edu.iis.powp.adapter.LinePlotterDrawerAdapter;
import edu.kis.powp.drawer.panel.DefaultDrawerFrame;
import edu.kis.powp.drawer.shape.LineFactory;


public class TestRectangle
{
    public static void main(String[] args)
    {
        DefaultDrawerFrame.getDefaultDrawerFrame().setVisible(true);
        IPlotter plotter = new LinePlotterDrawerAdapter(LineFactory.getBasicLine());
        IPlotterCommand plotterCommand = ComplexCommandFactory.createTriangle(2,2,2,150,150,75);
        plotterCommand.execute(plotter);
    }
}
