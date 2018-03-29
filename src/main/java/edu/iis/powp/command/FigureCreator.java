package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

public class FigureCreator {

    public static void SquareScript(IPlotter iPlotter){
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new CommandSetPosition(80,80));
        complexCommand.addCommand(new CommandDrawLineToPosition(-80,80));
        complexCommand.addCommand(new CommandDrawLineToPosition(-80,-80));
        complexCommand.addCommand(new CommandDrawLineToPosition(80,-80));
        complexCommand.addCommand(new CommandDrawLineToPosition(80,80));
        complexCommand.execute(iPlotter);
    }

    public static void CircleScript(IPlotter iPlotter){
        ComplexCommand complexCommand = new ComplexCommand();
        int centerX = 0;
        int centerY = 0;
        int r = 80;

        complexCommand.addCommand(new CommandSetPosition(r,centerY));
        double x,y;

        for(float i=0; i<=6.3; i+=0.1){
            x = centerX + r * Math.cos(i);
            y = centerY + r * Math.sin(i);
            complexCommand.addCommand(new CommandDrawLineToPosition((int)x,(int)y));
            complexCommand.execute(iPlotter);
        }
    }

    public static void CombinedScript(IPlotter iPlotter){
        CommandGenerator commandGenerator = new CommandGenerator();
        commandGenerator.execute(iPlotter);
    }
}
