package edu.iis.powp.factory;

import edu.iis.powp.command.ComplexCommand;

public abstract class ShapeFactory {
    public abstract ComplexCommand createShapeCommand();
}
