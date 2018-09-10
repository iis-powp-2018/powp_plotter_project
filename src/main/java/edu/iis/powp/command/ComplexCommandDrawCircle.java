package edu.iis.powp.command;

public class ComplexCommandDrawCircle {

    public ComplexCommand buildSquareComplexCommand (int x0, int y0, int radius)
    {
        // circle equation (x-posX)^2 + (y-posY)^2 = r^2
        ComplexCommand complexCommandCircle = new ComplexCommand();
        int x = radius-1;
        int y = 0;
        int dx = 1;
        int dy = 1;
        int err = dx - (radius << 1);

        while (x >= y)
        {
            complexCommandCircle.add(new CommandSetPosition(x0 + x, y0 + y));
            complexCommandCircle.add(new CommandDrawLineToPosition(x0 + x, y0 + y));
            complexCommandCircle.add(new CommandSetPosition(x0 + y, y0 + x));
            complexCommandCircle.add(new CommandDrawLineToPosition(x0 + y, y0 + x));
            complexCommandCircle.add(new CommandSetPosition(x0 - y, y0 + x));
            complexCommandCircle.add(new CommandDrawLineToPosition(x0 - y, y0 + x));
            complexCommandCircle.add(new CommandSetPosition(x0 - x, y0 + y));
            complexCommandCircle.add(new CommandDrawLineToPosition(x0 - x, y0 + y));
            complexCommandCircle.add(new CommandSetPosition(x0 - x, y0 - y));
            complexCommandCircle.add(new CommandDrawLineToPosition(x0 - x, y0 - y));
            complexCommandCircle.add(new CommandSetPosition(x0 - y, y0 - x));
            complexCommandCircle.add(new CommandDrawLineToPosition(x0 - y, y0 - x));
            complexCommandCircle.add(new CommandSetPosition(x0 + y, y0 - x));
            complexCommandCircle.add(new CommandDrawLineToPosition(x0 + y, y0 - x));
            complexCommandCircle.add(new CommandSetPosition(x0 + x, y0 - y));
            complexCommandCircle.add(new CommandDrawLineToPosition(x0 + x, y0 - y));

            if (err <= 0)
            {
                y++;
                err += dy;
                dy += 2;
            }

            if (err > 0)
            {
                x--;
                dx += 2;
                err += dx - (radius << 1);
            }

        }

        return complexCommandCircle;
    }

}
