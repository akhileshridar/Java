// Jimmy Liu
// January 30, 2013
// Calvin.java
// This program paints a picture of Calvin using Paint, JFrames, and JPanel

// Class Methods:
// Calvin(): Creates a JFrame and JPanel
// paintComponent(Graphic g): uses a nested for loop to create the grid used to draw Calvin on, using the graphics compenent.

// Class Variables:					
// col: column cordinates of grid
// row: row cordinates of grid
// redhor: draw a red line every 5 spaces horizontally
// redvert: draw a red line every 5 spaces vertically
// rec: draw rectangle body box 4 times							
// rec2: draw 4 more rectangle boxesds

import java.awt.*;
import javax.swing.*;

public class Calvin {

    JFrame frame; //Creates new Jframe and JPanel
    MyPanel panel;

    public static void main(String[] args) {
        Calvin calvin = new Calvin();
        calvin.Calvin(); //Constructers
    }

    public void Calvin() {
        frame = new JFrame("Calvin"); //Initilizing JFrame 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Telling JFrame to exit on close

        panel = new MyPanel(); //Initizlizing JPanel
        frame.getContentPane().add(panel, BorderLayout.CENTER); //JPanel is located in the center

        panel.setBackground(Color.white); //Background color set to white
        frame.setSize(500, 650); //Made frame 500x650
        frame.setVisible(true); //Made JFrame visable, changing default

    }

} // Calvin() end 

class MyPanel extends JPanel { //extends Calvin class

    public void paintComponent(Graphics g) {
        super.paintComponent(g); //runs superclass constructers
        Graphics2D g2 = (Graphics2D) g;
        g.setColor(Color.gray); //set color to

        //print out grid
        for (int col = 0; col < 55; col++)
        for (int row = 0; row < 40; row++) {
            g.drawRect(50 + row * 10, 50 + col * 10, 10, 10);
        }
        int redhor = 0;
        g.setColor(Color.red);
        while (redhor < 55) {
            g.drawLine(50, 50 + redhor * 10, 450, 50 + redhor * 10);
            redhor += 5;
        }
        int redvert = 0;
        while (redvert < 40) {
            g.drawLine(50 + redvert * 10, 50, 50 + redvert * 10, 600);
            redvert += 5;
        }
        //end grid print

        g2.setStroke(new BasicStroke(2));
        g.setColor(Color.black);

        //draw hair lines
        g.drawLine(320, 200, 350, 120);
        g.drawLine(360, 230, 410, 190);
        g.drawLine(360, 240, 430, 250);
        g.drawLine(380, 280, 410, 280);
        g.drawLine(380, 330, 420, 320);
        g.drawLine(290, 190, 320, 90);
        g.drawLine(280, 190, 270, 90);
        g.drawLine(270, 90, 230, 190);
        g.drawLine(220, 200, 180, 110);
        g.drawLine(170, 120, 170, 220);
        g.drawLine(140, 260, 120, 180);
        g.drawLine(80, 250, 120, 290);
        g.drawLine(80, 280, 110, 320);
        g.drawLine(110, 320, 70, 320);

        //eyebrows
        g.drawArc(220, 210, 40, 30, 45, 105);
        g.drawArc(280, 210, 40, 30, 0, 120);

        //outer eyes
        g.drawOval(180, 260, 80, 130);
        g.drawOval(260, 250, 80, 140);

        //inner eyebrows
        g.fillOval(230, 320, 20, 30);
        g.fillOval(270, 320, 20, 40);

        //face
        g.drawArc(110, 200, 270, 300, 170, 200);

        //smile/frown
        g.drawLine(230, 460, 260, 470);

        //nose
        g.drawArc(230, 380, 50, 40, 35, -250);

        //draw CheekArcs
        g.drawArc(90, 370, 40, 60, 90, 180);
        g.drawArc(80, 370, 61, 60, -90, 41);
        
        //color set white
        g.setColor(Color.white);
        g.fillOval(90, 370, 50, 60);
        g.fillOval(350, 370, 50, 60);
        //color back to black
        g.setColor(Color.black);
		g.drawArc(350, 370, 50, 60, 77, -200);
		g.drawArc(90, 370, 50, 60, 100, 210);
        
        int l = 0;

        //arm
        for (int rec = 0; rec < 4; rec++) {
            g.setColor(Color.white);
            g2.fillRoundRect(210 - rec - 1, 500 + l - 1, 40 + rec + rec - 2, 20 - 0, 8, 8);
            g.setColor(Color.black);
            g2.drawRoundRect(210 - rec, 500 + l, 40 + rec + rec, 20, 8, 8);
            l += 20;
        }
        l = 0;

        //body 
        for (int rec2 = 0; rec2 < 4; rec2++) {
            g2.drawRoundRect(250 + rec2, 500 + l, 30 + 2 * rec2, 20, 8, 8);
            l += 20;

        }


        //bottom rectangle lines
        g.drawLine(220, 600, 220, 580);
        g.drawLine(240, 600, 240, 580);

        //bottom rectangle
        g.drawRoundRect(211, 580, 80, 20, 8, 8);
        g.setColor(Color.white);
        g.drawLine(50, 600, 450, 600);

    } // end drawing Calvin
} // end MyPanel Class