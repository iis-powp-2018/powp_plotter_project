package edu.iis.powp.appext;

import edu.iis.powp.app.Application;
import edu.iis.powp.app.Context;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.events.predefine.SelectClearPanelOptionListener;
import edu.kis.powp.drawer.panel.DrawPanelController;

/**
 * Application.
 */
public class ApplicationWithDrawer {

    private static boolean isAppCreated = false;
	
    /**
     * Startup configuration.
     */
	public synchronized static void configureApplication()
	{
	    if (!isAppCreated)
	    {
	    	isAppCreated = true; 
	        
	    	Application.configureApplication();
	    	
	        Application.addComponent(DriverManager.class);
	        Application.addComponent(Context.class);
	        //this code below is responsible for main application window
	        Context context = Application.getComponent(Context.class);
	        
	        setupDrawerPlugin(context); //this line is responsible for part of right page of window where should be drawing
	        
	        context.setVisibility(true); //it is rensponsible for visibility of main application window 
	    }
	}

	/**
	 * Setup Drawer Plugin and add to context.
	 * 
	 * @param context Application context.
	 */
	private static void setupDrawerPlugin(Context context) {
		
		SelectClearPanelOptionListener selectClearPanelOptionListener = new SelectClearPanelOptionListener();
	
		Application.addComponent(DrawPanelController.class);
		context.addComponentMenu(DrawPanelController.class, "Draw Panel", 0);
		context.addComponentMenuElement(DrawPanelController.class, "Clear Panel", selectClearPanelOptionListener);
		
        getDrawPanelController().initialize(context.getFreePanel());
	}

	 /**
     * Get controller of application drawing panel.
     * 
     * @return drawPanelController.
     */
	public static DrawPanelController getDrawPanelController() {
		return Application.getComponent(DrawPanelController.class);
	}

}
