package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.line.SpecialLine;

import java.awt.*;

public class LinePlotterAdapter implements IPlotter {
    private static String TAG = LinePlotterAdapter.class.getSimpleName();
    private ILine line;
    private int startX = 0, startY = 0;
    private String name;

    private DrawPanelController drawPanelController;

    public LinePlotterAdapter(DrawPanelController drawController, ILine line, String name) {
        super();
        this.drawPanelController = drawController;
        this.line = line;
        this.name = name;
    }

    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void drawTo(int x, int y) {
        line.setStartCoordinates(this.startX, this.startY);
        this.setPosition(x, y);
        line.setEndCoordinates(x, y);

        drawPanelController.drawLine(line);
    }

    @Override
    public String toString() {
        return "Dirver:" + TAG;
    }
}
