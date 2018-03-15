package edu.iis.powp.adapter;

import edu.kis.powp.drawer.shape.ILine;

import java.awt.*;

public class ILineAdapter implements ILine {
    private java.awt.Color color;
    private float thickness;
    ILine line;

    public ILineAdapter(ILine line){
        super();
        this.line = line;
        this.color = line.getColor();
        this.thickness = line.getThickness();
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setThickness(float thickness) {
        this.thickness = thickness;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        ILineAdapter newLine = new ILineAdapter((ILine)this.line.clone());
        newLine.setColor(this.color);
        newLine.setThickness(this.thickness);

        return newLine;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public float getThickness() {
        return this.thickness;
    }

    @Override
    public boolean isDotted() {
        return line.isDotted();
    }

    @Override
    public int getStartCoordinateX() {
        return line.getStartCoordinateX();
    }

    @Override
    public int getEndCoordinateX() {
        return line.getEndCoordinateX();
    }

    @Override
    public int getStartCoordinateY() {
        return line.getStartCoordinateY();
    }

    @Override
    public int getEndCoordinateY() {
        return line.getEndCoordinateY();
    }

    @Override
    public void setStartCoordinates(int i, int i1) {
        line.setStartCoordinates(i, i1);
    }

    @Override
    public void setEndCoordinates(int i, int i1) {
        line.setEndCoordinates(i, i1);
    }

}
