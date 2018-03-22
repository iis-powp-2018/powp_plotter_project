package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

public class CommandSetPosition implements IPlotterCommand{

    private int posX;
    private int posY;

    @Override
    public void execute(IPlotter iPlotter) {
        iPlotter.setPosition(posX, posY);
    }

    public CommandSetPosition(int posX, int posY){
        super();
        this.posX = posX;
        this.posY = posY;
    }


}
