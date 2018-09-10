package edu.iis.powp.command;

public class ComplexCommandDrawTriangle {

    public ComplexCommand buildSquareComplexCommand (int posX, int posY, int sideLength)
    {
        ComplexCommand complexCommandSquare = new ComplexCommand();
        complexCommandSquare.add(new CommandSetPosition(posX, posY));
        complexCommandSquare.add(new CommandDrawLineToPosition(posX+sideLength, posY));
        complexCommandSquare.add(new CommandDrawLineToPosition(posX-(sideLength/2), posY + (sideLength * (int) Math.sqrt(3))/2));
        complexCommandSquare.add(new CommandDrawLineToPosition(posX, posY));

        return complexCommandSquare;
    }
}
