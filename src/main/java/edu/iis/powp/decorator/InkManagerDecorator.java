package edu.iis.powp.decorator;

import edu.iis.client.plottermagic.IPlotter;

public class InkManagerDecorator extends InkManager implements IPlotter{

    private IPlotter driver;
    private Integer x1 = null, y1 = null, x2, y2;

    public InkManagerDecorator(IPlotter driver) {
        this.driver = driver;
    }

    @Override
    public void setPosition(int x, int y) {
        driver.setPosition(x,y);
        x1 = x;
        y1 = y;
    }

    @Override
    public void drawTo(int x, int y) {

        if(y1 == null || x1 == null){
            x1 = 0;
            y1 = 0;
        }
        x2 = x;
        y2 = y;

        double inkUsage = changeInkLevel(lineLength(x1,x2,y1,y2));

        System.out.println("Poziom tuszu: " + inkLevel);

        if (inkUsage >= 0) {
            // not enough ink to print all line
            System.out.println("KONIEC TUSZU");
        }
        else{
            System.out.println("DRUKUJE");
            driver.drawTo(x, y);
        }
    }

    public double lineLength(int x1, int x2, int y1, int y2){

        double ac = Math.abs(y2 - y1);
        double cb = Math.abs(x2 - x1);
        System.out.println("Długość: " + Math.hypot(ac,cb));

        return Math.hypot(ac, cb);

    }

}
