package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.appext.ApplicationWithDrawer;
import edu.kis.powp.drawer.panel.DrawPanelController;

public class SelectTestFigureOptionListener1 implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent e)
    {
    	
        FiguresJoe.figureScript1(Application.getComponent(DriverManager.class).getCurrentPlotter());
    }

}
