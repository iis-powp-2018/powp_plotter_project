package edu.iis.powp.adapter;

import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;
import edu.kis.powp.drawer.shape.line.AbstractLine;
import java.awt.*;

public abstract class ILineAdapter /*implements ILine */{
    private java.awt.Color color;
    private float thickness;

    public ILineAdapter(ILine line){
//        this.line = line;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setThickness(float thickness) {
        this.thickness = thickness;
    }

//    @Override
    public Color getColor() {
        return color;
    }

//    @Override
    public float getThickness() {
        return thickness;
    }

}
