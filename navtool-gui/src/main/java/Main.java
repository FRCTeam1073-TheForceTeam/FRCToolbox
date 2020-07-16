package org.frc1073.toolbox.navtool;

import javax.swing.*;
import java.awt.*;

import org.frc1073.toolbox.util.Vec2D;

class Main {


    public static class Painter extends JPanel {
	public void paintComponent(Graphics g) {
	    System.out.println("*");
	    g.setColor(Color.orange);
	    g.fillRect(0, 0, getWidth(), getHeight());
	    g.setColor(Color.red);
	    g.fillOval(getWidth()/4, getHeight()/4,
		       getWidth()/2, getHeight()/2);
	}
    }
    
    public static void main(String args[]){
	
       JFrame frame = new JFrame("My First GUI");
       
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       frame.setSize(300,300);
       
       JButton button = new JButton("Press");
       Painter drawing = new Painter();
       
        // Adds Button to content pane of frame
       frame.getContentPane().add(BorderLayout.NORTH, button);
       frame.getContentPane().add(BorderLayout.CENTER, drawing);
       frame.setVisible(true);
    }
}
