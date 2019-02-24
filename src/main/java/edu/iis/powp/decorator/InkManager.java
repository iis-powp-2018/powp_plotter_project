package edu.iis.powp.decorator;

import edu.iis.client.plottermagic.IPlotter;

public class InkManager {

    protected double inkLevel = 700;

    protected double changeInkLevel(double distance) {

        double inkLeft =  inkLevel - distance;

        if (inkLeft <= 0)
        {
            inkLevel = 0;
            // return length that can be printed
            return distance - Math.abs(inkLeft);

        }
        else {
            inkLevel -= distance;
            return -1;
        }

    }
}
