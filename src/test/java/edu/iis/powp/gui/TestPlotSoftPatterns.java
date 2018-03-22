package edu.iis.powp.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.iis.client.plottermagic.ClientPlotter;
import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.adapter.DrawPanelPlotterAdapter;
import edu.iis.powp.adapter.LineAdapter;
import edu.iis.powp.adapter.LinePlotterAdapter;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.Context;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.appext.ApplicationWithDrawer;
import edu.iis.powp.events.predefine.*;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.LineFactory;


public class TestPlotSoftPatterns
{
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private final static List<LineAdapter> LINES = new LinkedList<>();

    /**
	 * Setup test concerning preset figures in context.
	 *
	 * @param context Application context.
	 */
	private static void setupPresetTests(Context context) {
		context.addTest("Figure Joe 1", new SelectFirstTestFigureOptionListener());
		context.addTest("Figure Joe 2", new SelectSecondTestFigureOptionListener());
		context.addTest("Figure Jane", new SelectJaneTestFigureOptionListener());
		context.addTest("ComplexCommand", new SelectComplexCommandFigureOptionListener());
		context.addTest("Set position 1 (0, 0)", new SelectSetPositionOneOptionListener());
		context.addTest("Set position 2 (50, 0)", new SelectSetPositionTwoOptionListener());
		context.addTest("Draw line to (25, 50)", new SelectDrawLineToPositionOptionListener());
		context.addTest("Draw 50 x 50 square with factory", new SelectDrawRectangleOptionListener());
		context.addTest("Draw 50 x 50 right triangle with factory", new SelectDrawRightTriangleOptionListener());
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
        DrawPanelController drawPanelController = ApplicationWithDrawer.getDrawPanelController();

        IPlotter plotter = new DrawPanelPlotterAdapter(drawPanelController);
        context.addDriver("Buggy Simulator", plotter);

        LINES.add(new LineAdapter(LineFactory.getBasicLine(), "Basic Line"));
        LINES.add(new LineAdapter(LineFactory.getDottedLine(), "Dotted Line"));
        LINES.add(new LineAdapter(LineFactory.getSpecialLine(), "Special Line"));

        for(LineAdapter line : LINES) {
            String plotterName = line.toString() + " Plotter";
            IPlotter linePlotter = new LinePlotterAdapter(drawPanelController, line, plotterName);
            context.addDriver(plotterName, linePlotter);
        }

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

	private static void setupLineProperties(Context context) {
        Application.addComponent(LineAdapter.class);
        context.addComponentMenu(LineAdapter.class, "Line setup", 0);
        context.addComponentMenuElement(LineAdapter.class, "Set red", (ActionEvent e) -> {
            LOGGER.log(Level.INFO, "All newly plotted lines will be red now");
            for(LineAdapter line : LINES) {
                line.setColor(Color.RED);
            }
        });

        context.addComponentMenuElement(LineAdapter.class, "Set black", (ActionEvent e) -> {
            LOGGER.log(Level.INFO, "All newly plotted lines will be black now");
            for(LineAdapter line : LINES) {
                line.setColor(Color.BLACK);
            }
        });

        context.addComponentMenuElement(LineAdapter.class, "Set blue", (ActionEvent e) -> {
            LOGGER.log(Level.INFO, "All newly plotted lines will be blue now");
            for(LineAdapter line : LINES) {
                line.setColor(Color.BLUE);
            }
        });

        context.addComponentMenuElement(LineAdapter.class, "Make thicker", (ActionEvent e) -> {
            LOGGER.log(Level.INFO, "All newly plotted lines will be 0.5 thicker now");
            for(LineAdapter line : LINES) {
                line.setThickness(line.getThickness() + 0.5f);
            }
        });

        context.addComponentMenuElement(LineAdapter.class, "Make more thin", (ActionEvent e) -> {
            LOGGER.log(Level.INFO, "All newly plotted lines will be 0.5 more thin now");
            for(LineAdapter line : LINES) {
                line.setThickness(line.getThickness() - 0.5f);
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
            	setupLineProperties(context);
            }

        });
    }

}
