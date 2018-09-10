package edu.iis.powp.command;

public class ComplexCommandDrawSquare {

    public ComplexCommand buildSquareComplexCommand (int posX, int posY, int sideLength)
    {
        ComplexCommand complexCommandSquare = new ComplexCommand();
        complexCommandSquare.add(new CommandSetPosition(posX, posY));
        complexCommandSquare.add(new CommandDrawLineToPosition(posX+sideLength, posY));
        complexCommandSquare.add(new CommandSetPosition(posX+sideLength, posY+sideLength));
        complexCommandSquare.add(new CommandSetPosition(posX, posY+sideLength));
        complexCommandSquare.add(new CommandSetPosition(posX, posY));

        return complexCommandSquare;
    }
}
