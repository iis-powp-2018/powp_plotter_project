package edu.iis.powp.events.predefine;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.adapter.SpecialLinePlotterAdapter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectLineTypeOptionListener implements ActionListener {

    private SpecialLinePlotterAdapter specialLinePlotter;
    private int index;

    public SelectLineTypeOptionListener(int index, IPlotter usedPlotter){
        super();
        this.index = index;
        this.specialLinePlotter = (SpecialLinePlotterAdapter) usedPlotter;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(index == 1)
            specialLinePlotter.setBasicLineType();
        else if(index == 2)
            specialLinePlotter.setDottedLineType();
        else
            specialLinePlotter.setSpecialLineType();
    }
}
