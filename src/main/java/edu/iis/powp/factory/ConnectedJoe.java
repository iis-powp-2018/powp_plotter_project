package edu.iis.powp.factory;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.command.CommandDrawLineToPosition;
import edu.iis.powp.command.CommandSetPosition;
import edu.iis.powp.command.ComplexCommand;

public class ConnectedJoe implements IPlotter, Figure {

    private ComplexCommand commandList = new ComplexCommand();

    @Override
    public void setPosition(int i, int i1) {
        commandList.addCommandToList(new CommandSetPosition(i, i1));
    }

    @Override
    public void drawTo(int i, int i1) {
        commandList.addCommandToList(new CommandDrawLineToPosition(i, i1));
    }

    @Override
    public void draw(IPlotter driver) {
        commandList.execute(driver);
    }

    public ConnectedJoe(){
        FiguresJoe.figureScript1(this);
        FiguresJoe.figureScript2(this);
    }
}
