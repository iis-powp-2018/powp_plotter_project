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
public class CircleFactory {
    public static ComplexCommand createNewCircle (int circleX, int circleY, int r)
    {
        LinkedList <PlotterCommand> commandsList;
        commandsList = new LinkedList <> ();

        float step = 0;
 	double x = circleX + r * Math.cos(step);
 	double y = circleY + r * Math.sin(step);

        PlotterCommand command = new CommandSetPosition((int)x, (int)y);
 	commandsList.add(command);
                
        for(int i =0; i <= 720;i++) {
            x = circleX + r * Math.cos(step);
            y = circleY + r * Math.sin(step);
            step = i;
            command = new CommandDrawLineToPosition((int)x, (int)y);
            commandsList.add(command);
        }
 		
       return new ComplexCommand(commandsList);
    }
}


