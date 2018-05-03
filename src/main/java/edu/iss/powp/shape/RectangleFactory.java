/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iss.powp.shape;

import edu.iss.powp.command.CommandDrawLineToPosition;
import edu.iss.powp.command.CommandSetPosition;
import edu.iss.powp.command.ComplexCommand;
import edu.iss.powp.command.PlotterCommand;
import java.util.LinkedList;

/**
 *
 * @author Gość
 */
public class RectangleFactory {
    public static ComplexCommand createNewRectangle (int x, int sizeX, int y, int sizeY)
    {
        LinkedList <PlotterCommand> commandsList;
        commandsList = new LinkedList <> ();
        
        commandsList.add(new CommandSetPosition(x,y));
        commandsList.add(new CommandDrawLineToPosition(x+sizeX,y));
        commandsList.add(new CommandDrawLineToPosition(x+sizeX,y+sizeY));
        commandsList.add(new CommandDrawLineToPosition(x,y+sizeY));
        commandsList.add(new CommandDrawLineToPosition(x,y));

        return new ComplexCommand(commandsList);
    }
}
