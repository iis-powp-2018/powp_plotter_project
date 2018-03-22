package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.client.plottermagic.preset.FiguresJane;
import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.adapter.AbstractPloterAdapter;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;

public class SelectTestFigureOptionListener implements ActionListener {
    private String testName;

    public SelectTestFigureOptionListener(String testName){
        this.testName = testName;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        switch (testName) {
            case PredefinedTestNames.TEST_FIGURE_JOE_FIRST_SCRIPT:
                FiguresJoe.figureScript1(Application.getComponent(DriverManager.class).getCurrentPlotter());
                break;
            case PredefinedTestNames.TEST_FIGURE_JOE_SECOND_SCRIPT:
                FiguresJoe.figureScript2(Application.getComponent(DriverManager.class).getCurrentPlotter());
                break;
            case PredefinedTestNames.TEST_FIGURE_JANE:
                FiguresJane.figureScript(new AbstractPloterAdapter(0,0));
                break;

        }
    }
}
