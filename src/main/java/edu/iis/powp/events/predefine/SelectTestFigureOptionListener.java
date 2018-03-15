package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.PlotterCommand;
import edu.iis.powp.factory.RectangleFactory;
import edu.iis.powp.factory.TriangleFactory;

public class SelectTestFigureOptionListener implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent e)
    {
    	switch(e.getActionCommand())
    	{
    	case "Figure Joe 1":
            FiguresJoe.figureScript1(Application.getComponent(DriverManager.class).getCurrentPlotter());
    		break;
    	case "Figure Joe 2":
            FiguresJoe.figureScript2(Application.getComponent(DriverManager.class).getCurrentPlotter());
    		break;
    	case "Prostokąt":
    		RectangleFactory rectangleFactory = new RectangleFactory();
    		PlotterCommand rectangleCommand = rectangleFactory.getRectangleDrawCommand(0, 0, 100, 50);
    		rectangleCommand.execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
    		break;
    	case "Trójkąt":
    		TriangleFactory triangleFactory = new TriangleFactory();
    		PlotterCommand traingleCommand = triangleFactory.getTriangleDrawCommand(0, 0, 100, 150, 200, 40);
    		traingleCommand.execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
    		break;
    	}
    	
    }
}
