package edu.iis.powp.adapter;

import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.line.AbstractLine;

import java.awt.*;

public class ILineAdapter extends AbstractLine {
    private java.awt.Color color;
    private float thickness;

    // w tej chwili nic się nawet nie rysuje
    // tutaj bez sensu gdy odkomentować -> nie powinno się chyba mieć ILine w sobie
    // jednoczesnie to super() nic nie daje bo to Abstrakcyjna klasa
    // juz straciłam cierpliwość do tego podpunktu, chyba jednak potrzebuje po prostu zobaczyć rozwiązanie :(

//    ILine line;

    public ILineAdapter(ILine line){
        super();
//        this.line = line;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setThickness(float thickness) {
        this.thickness = thickness;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public float getThickness() {
        return thickness;
    }

}
