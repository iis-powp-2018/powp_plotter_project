package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.client.plottermagic.preset.FiguresJoe;

public class CommandGenerator implements IPlotter {

    private ComplexCommand complexCommand = new ComplexCommand();

    @Override
    public void setPosition(int i, int i1) {
        complexCommand.addCommand(new CommandSetPosition(i,i1));
    }

    @Override
    public void drawTo(int i, int i1) {
        complexCommand.addCommand(new CommandDrawLineToPosition(i,i1));
    }

    public void execute(IPlotter iPlotter){
        complexCommand.execute(iPlotter);
    }

    public CommandGenerator(){
        FiguresJoe.figureScript1(this);
        FiguresJoe.figureScript2(this);
    }
}
