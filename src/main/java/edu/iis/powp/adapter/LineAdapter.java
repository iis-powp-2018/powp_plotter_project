package edu.iis.powp.adapter;

import edu.kis.powp.drawer.shape.ILine;

import java.awt.*;

public class LineAdapter implements ILine {
    private ILine line;
    private Color color;
    private float thickness;
    private String name;

    public LineAdapter(ILine line, String name) {
        super();
        this.line = line;
        this.name = name;
        this.thickness = line.getThickness();
        this.color = line.getColor();
    }

    public LineAdapter(LineAdapter line) throws CloneNotSupportedException {
        super();
        this.line = (ILine) line.line.clone();
        setColor(line.getColor());
        setThickness(line.getThickness());
        this.name = line.name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new LineAdapter(this);
    }

    @Override
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public float getThickness() {
        return thickness;
    }

    public void setThickness(float thickness) {
        this.thickness = thickness;
        if(this.thickness < 0.1f) {
            this.thickness = 0.1f;
        }
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

    @Override
    public String toString() {
        return name;
    }
}
