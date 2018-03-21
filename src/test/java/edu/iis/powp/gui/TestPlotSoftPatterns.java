package edu.iis.powp.gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.iis.client.plottermagic.ClientPlotter;
import edu.iis.client.plottermagic.IPlotter;
import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.adapter.LinePlotterAdapter;
import edu.iis.powp.adapter.PlotterDrawerAdapter;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.Context;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.appext.ApplicationWithDrawer;
import edu.iis.powp.events.predefine.SelectChangeVisibleOptionListener;
import edu.iis.powp.events.predefine.SelectTestFigureOptionListener;
import edu.iis.powp.factory.MyFigureJoe1Factory;
import edu.iis.powp.factory.RectangleFactory;
import edu.iis.powp.factory.SquareFactory;
import edu.iis.powp.factory.TriangleFactory;
import edu.kis.powp.drawer.panel.DefaultDrawerFrame;
import edu.kis.powp.drawer.panel.DrawPanelController;


public class TestPlotSoftPatterns
{
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		
    /**
	 * Setup test concerning preset figures in context.
	 * 
	 * @param context Application context.
	 */
	private static void setupPresetTests(Context context) {
	    SelectTestFigureOptionListener selectTestFigureOptionListener = new SelectTestFigureOptionListener();
		context.addTest("Figure Joe 1", selectTestFigureOptionListener);	   
		//added figureScripts2 test for Pat Tern 
		
		context.addTest("Figure Joe 2", (e) -> {FiguresJoe.figureScript2(Application.getComponent(DriverManager.class).getCurrentPlotter());});
		context.addTest("Rectangle", (e)->{ RectangleFactory.prepareCommand(0, 0, 100, 150).execute(Application.getComponent(DriverManager.class).getCurrentPlotter());});
		context.addTest("Square", (e)->{ SquareFactory.prepareCommand(0, 0, 200).execute(Application.getComponent(DriverManager.class).getCurrentPlotter());});
		context.addTest("Triangle", (e)->{ TriangleFactory.prepareCommand(0, 0, 120, 120, 250, 50).execute(Application.getComponent(DriverManager.class).getCurrentPlotter());});
		context.addTest("My Figure Joe 1", (e)->{ MyFigureJoe1Factory.prepareCommand(0, 0, 200).execute(Application.getComponent(DriverManager.class).getCurrentPlotter());});
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
		
		IPlotter plotter = new PlotterDrawerAdapter();
		context.addDriver("Buggy Simulator", plotter);
		//added in context of added LinePlotterAdapter 
		IPlotter specialPlotter=new LinePlotterAdapter();
		context.addDriver("Plotter with special line", specialPlotter);
		//
		context.updateDriverInfo();
	}

	/**
	 * Auxiliary routines to enable using Buggy Simulator.
	 * 
	 * @param context Application context.
	 */
	private static void setupDefaultDrawerVisibilityManagement(Context context) {
		DefaultDrawerFrame defaultDrawerWindow = DefaultDrawerFrame.getDefaultDrawerFrame();
        context.addComponentMenuElementWithCheckBox(DrawPanelController.class, "Default Drawer Visibility", 
        		new SelectChangeVisibleOptionListener(defaultDrawerWindow), true);
        defaultDrawerWindow.setVisible(true);
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
                //commented because additional window is unnecessary
                //setupDefaultDrawerVisibilityManagement(context);
                 setupDrivers(context);
             	setupPresetTests(context);
              	setupLogger(context);
            }

        });
    }

}
