package edu.iis.powp.command;

import static java.lang.Math.sqrt;

public class FigureCommandFactory {
    public static CommandComplex drawRectangle(){
        CommandComplex command = new CommandComplex();
        command.addCommand(new CommandSetPosition(-100, -100));
        command.addCommand(new CommandDrawLineToPosition(0,-100));
        command.addCommand(new CommandSetPosition(0, -100));
        command.addCommand(new CommandDrawLineToPosition(0,60));
        command.addCommand(new CommandSetPosition(0,60));
        command.addCommand(new CommandDrawLineToPosition(-100,60));
        command.addCommand(new CommandSetPosition(-100,60));
        command.addCommand(new CommandDrawLineToPosition(-100,-100));

        return command;
    }

    public static CommandComplex drawCircle(){
        CommandComplex command = new CommandComplex();
        int currentX = 0, currentY = 0;
        int radius = 100;
        //(x-x0)^2 + (y-y0)^2 = r^2
        
        for(int i = 1; i <= radius; i++){
            currentY = (int)(sqrt(radius*radius - currentX*currentX));
            command.addCommand(new CommandSetPosition(currentX, currentY));
            command.addCommand(new CommandDrawLineToPosition(currentX, currentY));
            currentX = currentX + 1;
        }

        for(int i = 1; i <= radius; i++){
            currentY = ~(int)(sqrt(radius*radius - currentX*currentX));
            command.addCommand(new CommandSetPosition(currentX, currentY));
            command.addCommand(new CommandDrawLineToPosition(currentX, currentY));
            currentX = currentX - 1;
        }

        for(int i = 1; i <= radius; i++){
            currentY = (int)(sqrt(radius*radius - currentX*currentX));
            command.addCommand(new CommandSetPosition(currentX, currentY));
            command.addCommand(new CommandDrawLineToPosition(currentX, currentY));
            currentX = currentX - 1;
        }

        for(int i = 1; i <= radius; i++){
            currentY = ~(int)(sqrt(radius*radius - currentX*currentX));
            command.addCommand(new CommandSetPosition(currentX, currentY));
            command.addCommand(new CommandDrawLineToPosition(currentX, currentY));
            currentX = currentX + 1;
        }

        return command;

    }
}
