/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iss.powp.shape;

import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Gość
 */
public class RectangleFactoryTest implements ActionListener{
 
 	@Override
 	public void actionPerformed(ActionEvent e) {
 		RectangleFactory.createNewRectangle(10, 100, 10, 40).execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
 	}
}