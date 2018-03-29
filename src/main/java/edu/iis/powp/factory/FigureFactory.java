package edu.iis.powp.factory;

public class FigureFactory {

    public static Figure drawRectangle(){
        return new Rectangle();
    }

    public static Figure drawCircle(){
        return new Circle();
    }

    public static Figure drawTriangle(){
        return new Triangle();
    }

    public static Figure drawConnectedJoe(){
        return new ConnectedJoe();
    }
}
