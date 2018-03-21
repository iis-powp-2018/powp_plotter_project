package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.PlotterCommand;
import edu.iis.powp.factory.ShapeFactory;

public class SelectTestFigureOptionListener implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent e)
    {
    	ShapeFactory shapeFactory = new ShapeFactory();

    	switch (e.getActionCommand()) 
        {
        case "Figure Joe 1":
    		FiguresJoe.figureScript1(Application.getComponent(DriverManager.class).getCurrentPlotter());
    		break;
        
        case "Figure Joe 2":
        	FiguresJoe.figureScript2(Application.getComponent(DriverManager.class).getCurrentPlotter());
    		break;
        
        case "Rectangle":
        	PlotterCommand rectangleCommand = shapeFactory.getRectangle();
        	rectangleCommand.execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
        	break;
        	
        case "Circle":
        	PlotterCommand circleCommand = shapeFactory.getCircle();
        	circleCommand.execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
        	break;
        }
    }
}
