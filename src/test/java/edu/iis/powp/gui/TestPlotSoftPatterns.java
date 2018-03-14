package edu.iis.powp.gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.iis.client.plottermagic.ClientPlotter;
import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.adapter.ILineAdapter;
import edu.iis.powp.adapter.LinePlotterAdapter;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.Context;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.appext.ApplicationWithDrawer;
import edu.iis.powp.events.predefine.SelectJaneTestFigureOptionListener;
import edu.iis.powp.events.predefine.SelectJoeTestFirstFigureOptionListener;
import edu.iis.powp.events.predefine.SelectJoeTestSecondFigureOptionListener;
import edu.kis.powp.drawer.shape.LineFactory;
import edu.kis.powp.drawer.shape.line.AbstractLine;

public class TestPlotSoftPatterns
{
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		
    /**
	 * Setup tests concerning preset figures in context.
	 * 
	 * @param context Application context.
	 */
	private static void setupPresetTests(Context context) {
	    SelectJoeTestFirstFigureOptionListener selectJoeTestFirstFigureOptionListener = new SelectJoeTestFirstFigureOptionListener();
        SelectJoeTestSecondFigureOptionListener selectJoeTestSecondFigureOptionListener = new SelectJoeTestSecondFigureOptionListener();
		SelectJaneTestFigureOptionListener selectJaneTestFigureOptionListener = new SelectJaneTestFigureOptionListener();
		
		context.addTest("Figure Joe 1", selectJoeTestFirstFigureOptionListener);
        context.addTest("Figure Joe 2", selectJoeTestSecondFigureOptionListener);
		context.addTest("Figure Jane", selectJaneTestFigureOptionListener);
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


		IPlotter basicPlotter = new LinePlotterAdapter(ApplicationWithDrawer.getDrawPanelController(), LineFactory.getBasicLine());
		context.addDriver("Simulation Basic Line Plotter", basicPlotter);

		IPlotter dottedPlotter = new LinePlotterAdapter(ApplicationWithDrawer.getDrawPanelController(), LineFactory.getDottedLine());
		context.addDriver("Simulation Dotted Line Plotter", dottedPlotter);

		ILineAdapter line = new ILineAdapter(LineFactory.getSpecialLine());
//		IPlotter specialPlotter = new LinePlotterAdapter(ApplicationWithDrawer.getDrawPanelController(), LineFactory.getSpecialLine());
		IPlotter specialPlotter = new LinePlotterAdapter(ApplicationWithDrawer.getDrawPanelController(), line);
		context.addDriver("Simulation Special Line Plotter", specialPlotter);

		context.updateDriverInfo();
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
            	setupLogger(context);
            }

        });
    }

}
