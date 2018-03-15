package edu.iis.powp.gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.iis.client.plottermagic.ClientPlotter;
import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.adapter.LinePlotterAdapter;
import edu.iis.powp.adapter.PlotterMagicToDrawerAdapter;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.Context;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.appext.ApplicationWithDrawer;
import edu.iis.powp.events.predefine.*;


public class TestPlotSoftPatterns
{
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private final static IPlotter speciaLinePlotter = new LinePlotterAdapter();
    /**
	 * Setup test concerning preset figures in context.
	 *
	 * @param context Application context.
	 */
	private static void setupPresetTests(Context context) {
	    SelectTestFigureOptionListener selectTestFigureOptionListener1 = new SelectTestFigureOptionListener(1);
		SelectTestFigureOptionListener selectTestFigureOptionListener2 = new SelectTestFigureOptionListener(2);

		context.addTest("Figure Joe 1", selectTestFigureOptionListener1);
		context.addTest("Figure Joe 2", selectTestFigureOptionListener2);
	}

	/**
	 * Setup driver manager, and set default IPlotter for application.
	 *
	 * @param context Application context.
	 */
	private static void setupDrivers(Context context) {
		IPlotter clientPlotter = new ClientPlotter();
		context.addDriver("Client Plotter [DO NOT USE]", clientPlotter);

		IPlotter plotter = new PlotterMagicToDrawerAdapter();
		context.addDriver("Custom Adapter", plotter);
		Application.getComponent(DriverManager.class).setCurrentPlotter(plotter);
        context.addDriver("Special Line Adapter", speciaLinePlotter);

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

	private static void setupLineTypeControl(Context context)
	{
		Application.addComponent(LinePlotterAdapter.class);
		context.addComponentMenu(LinePlotterAdapter.class, "Special Line Type");
		context.addComponentMenuElement(LinePlotterAdapter.class, "Dotted Line Type", new SelectDottedLineTypeOptionListener(speciaLinePlotter));
        context.addComponentMenuElement(LinePlotterAdapter.class, "Special Line Type", new SelectSpecialLineTypeOptionListener(speciaLinePlotter));
        context.addComponentMenuElement(LinePlotterAdapter.class, "Basic Line Type", new SelectBasicLineTypeOptionListener(speciaLinePlotter));

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
