package edu.iis.powp.gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.iis.client.plottermagic.ClientPlotter;
import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.adapter.SpecialLinePlotterAdapter;
import edu.iis.powp.adapter.PlotterAdapter;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.Context;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.appext.ApplicationWithDrawer;
import edu.iis.powp.events.predefine.*;


public class TestPlotSoftPatterns
{
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private final static IPlotter specialLinePlotter = new SpecialLinePlotterAdapter(0,0);

    /**
	 * Setup test concerning preset figures in context.
	 * 
	 * @param context Application context.
	 */
	private static void setupPresetTests(Context context) {
		context.addTest("Figure Joe 1", new SelectTestFigureOptionListener(1));
		context.addTest("Figure Joe 2", new SelectTestFigureOptionListener(2));
		context.addTest("Figure Jane" , new SelectTestFigureOptionListener(3, specialLinePlotter));
		context.addTest("CustomRectangle", new SelectTestFigureOptionListener(4));
		context.addTest("CustomCircle", new SelectTestFigureOptionListener(5));
		context.addTest("CustomTriangle", new SelectTestFigureOptionListener(6));
		context.addTest("ConnectedFiguresJoe", new SelectTestFigureOptionListener(7));
	}

	/**
	 * Setup driver manager, and set default IPlotter for application.
	 * 
	 * @param context Application context.
	 */
	private static void setupDrivers(Context context) {
		IPlotter clientPlotter = new ClientPlotter();
		context.addDriver("Client Plotter", clientPlotter);
		Application.getComponent(DriverManager.class).setCurrentPlotter(clientPlotter);
		
		IPlotter plotter = new PlotterAdapter();
		context.addDriver("Plotter Simulator", plotter);
		context.addDriver("Special Line Plotter Simulator", specialLinePlotter );

		context.updateDriverInfo();
	}

    private static void setupLineTypeControl(Context context) {
        Application.addComponent(SpecialLinePlotterAdapter.class);
        context.addComponentMenu(SpecialLinePlotterAdapter.class, "Special Line Type");
        context.addComponentMenuElement(SpecialLinePlotterAdapter.class, "Basic Line Type", new SelectLineTypeOptionListener(1,specialLinePlotter));
        context.addComponentMenuElement(SpecialLinePlotterAdapter.class, "Dotted Line Type", new SelectLineTypeOptionListener(2,specialLinePlotter));
        context.addComponentMenuElement(SpecialLinePlotterAdapter.class, "Special Line Type", new SelectLineTypeOptionListener(3,specialLinePlotter));
    }

	/**
	 * Setup menu for adjusting logging settings.
	 * 
	 * @param context Application context.
	 */
	private static void setupLogger(Context context) {
		Application.addComponent(Logger.class);
		context.addComponentMenu(Logger.class, "Logger", 0);
		context.addComponentMenuElement(Logger.class, "Clear log", (ActionEvent e) -> context.flushLoggerOutput());
		context.addComponentMenuElement(Logger.class, "Fine level", (ActionEvent e) -> LOGGER.setLevel(Level.FINE));
		context.addComponentMenuElement(Logger.class, "Info level", (ActionEvent e) -> LOGGER.setLevel(Level.INFO));
		context.addComponentMenuElement(Logger.class, "Warning level", (ActionEvent e) -> LOGGER.setLevel(Level.WARNING));
		context.addComponentMenuElement(Logger.class, "Severe level", (ActionEvent e) -> LOGGER.setLevel(Level.SEVERE));
		context.addComponentMenuElement(Logger.class, "OFF logging", (ActionEvent e) -> LOGGER.setLevel(Level.OFF));
	}
		
    /**
     * Launch the application.
     */
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                ApplicationWithDrawer.configureApplication();
                Context context = Application.getComponent(Context.class);
                
            	setupDrivers(context);
            	setupPresetTests(context);
            	setupLineTypeControl(context);
            	setupLogger(context);
            }
        });
    }

}
