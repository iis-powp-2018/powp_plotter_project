package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.ComplexCommand;
import edu.kis.powp.drawer.panel.DrawPanelController;

public class SelectComplexCommandOptionListener implements ActionListener
{

	@Override
    public void actionPerformed(ActionEvent e)
    {
		ComplexCommand cc = new ComplexCommand(0,0,100,100);
		cc.execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
    	/*DrawPanelController controller = Application.getComponent(DrawPanelController.class);
    	System.out.println(e.getActionCommand().toString());
    	if(e.getActionCommand().toString().equals("Complex")) {
    		controller.clearPanel();
    		FiguresJoe.figureScript1(Application.getComponent(DriverManager.class).getCurrentPlotter());
    	}*/
    }
}
