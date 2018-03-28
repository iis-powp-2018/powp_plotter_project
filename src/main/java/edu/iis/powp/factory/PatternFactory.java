package edu.iis.powp.factory;

public class PatternFactory {

    public static Pattern getSquarePattern(){
        return new SquarePattern();
    }
    public static Pattern getTrianglePattern(){
        return new TrianglePattern();
    }
}
