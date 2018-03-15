package edu.iis.powp.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
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
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;
import edu.kis.powp.drawer.shape.line.AbstractLine;

public class TestPlotSoftPatterns
{
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    private static ILineAdapter BASIC_LINE = new ILineAdapter(LineFactory.getBasicLine());
    private static ILineAdapter DOTTED_LINE = new ILineAdapter(LineFactory.getDottedLine());
    private static ILineAdapter SPECIAL_LINE = new ILineAdapter(LineFactory.getSpecialLine());
    private static ArrayList<ILineAdapter> LINES = new ArrayList<>();
		
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


		IPlotter basicPlotter = new LinePlotterAdapter(ApplicationWithDrawer.getDrawPanelController(), BASIC_LINE);
		context.addDriver("Simulation Basic Line Plotter", basicPlotter);

		IPlotter dottedPlotter = new LinePlotterAdapter(ApplicationWithDrawer.getDrawPanelController(), DOTTED_LINE);
		context.addDriver("Simulation Dotted Line Plotter", dottedPlotter);

		IPlotter specialPlotter = new LinePlotterAdapter(ApplicationWithDrawer.getDrawPanelController(), SPECIAL_LINE);
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
     * Setup menu for changing line colour and thickness.
     *
     * @param context Application context.
     */
    private static void setupLineParams(Context context) {
        LINES.add(BASIC_LINE);
        LINES.add(DOTTED_LINE);
        LINES.add(SPECIAL_LINE);

        Application.addComponent(ILine.class);
        context.addComponentMenu(ILine.class, "Line Parameters", 1);
//        context.addComponentMenuElement(ILine.class, "Clear parameters", (ActionEvent e) -> {
//            BASIC_LINE = new ILineAdapter(LineFactory.getBasicLine());
//            DOTTED_LINE = new ILineAdapter(LineFactory.getDottedLine());
//            SPECIAL_LINE = new ILineAdapter(LineFactory.getSpecialLine());
//        });
        context.addComponentMenuElement(ILine.class, "Colour: RED", (ActionEvent e) -> {
            for(ILineAdapter line : LINES){
                line.setColor(Color.RED);
            }
        });
        context.addComponentMenuElement(ILine.class, "Colour: BLUE", (ActionEvent e) -> {
            for(ILineAdapter line : LINES){
                line.setColor(Color.BLUE);
            }
        });
        context.addComponentMenuElement(ILine.class, "Colour: BLACK", (ActionEvent e) -> {
            for(ILineAdapter line : LINES){
                line.setColor(Color.BLACK);
            }
        });
        context.addComponentMenuElement(ILine.class, "Thickness: 2", (ActionEvent e) -> {
            for(ILineAdapter line : LINES){
                line.setThickness(2);
            }
        });
        context.addComponentMenuElement(ILine.class, "Thickness: 5", (ActionEvent e) -> {
            for(ILineAdapter line : LINES) {
                line.setThickness(5);
            }
        });
        context.addComponentMenuElement(ILine.class, "Thickness: 8", (ActionEvent e) -> {
            for(ILineAdapter line : LINES) {
                line.setThickness(8);
            }
        });
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
                setupLineParams(context);
            }

        });
    }

}
