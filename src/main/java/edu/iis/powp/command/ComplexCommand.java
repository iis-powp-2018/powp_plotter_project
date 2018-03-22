package edu.iis.powp.command;

import java.util.ArrayList;

import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand implements PlotterCommand {
	
	private ArrayList<Integer> posX = new ArrayList<Integer>();
	private ArrayList<Integer> posY = new ArrayList<Integer>();
	
	public void addPositionToList(int x, int y) {
		this.posX.add(x);
		this.posY.add(y);
	}

	@Override
	public void execute(IPlotter driver) {
		
	}
}
