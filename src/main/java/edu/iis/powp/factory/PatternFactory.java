package edu.iis.powp.factory;

public class PatternFactory {

    public Pattern getSquarePattern(Pattern pattern){
        return new Square();
    }
}
