package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectComplexCommandOptionListener implements ActionListener
{

    private int figureType = 0;

    public SelectComplexCommandOptionListener(int figureType)
    {
        this.figureType = figureType;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {

        switch(figureType)
        {
            case 1:
                System.out.println("Figura 1.");
                break;
            default:
                System.out.println("Figura 2.");
                break;
        }

    }
}
