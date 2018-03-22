package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

public class CommandDrawLineToPosition implements  IPlotterCommand{

    private int posX;
    private int posY;

    @Override
    public void execute(IPlotter iPlotter) {
        iPlotter.drawTo(posX, posY);
    }

    public CommandDrawLineToPosition(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
    }
}
