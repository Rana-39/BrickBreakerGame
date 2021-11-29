/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickBreaker1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;
//classes
/**
 *
 * @author rannn
 */
public class Gameplay extends JPanel implements KeyListener, ActionListener{
    private boolean play = false;
    //the game can't start by itself 
    private int score = 0;
    //initial value of score
    private int totalBricks = 21;
    //number of bricks
    private Timer timer;
    private int delay =8;
    //ball speed
    private int playerX  =310;
    //stick position 
    private int ballposX = 120;
    private int ballposY = 350;
    //ball position 
    private int ballXdir = -1;
    private int ballYdir = -2;
    //ball direction 
    
    
    public Gameplay(){
   //contractor     
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay, this);
        timer.start();
    }
    
    @Override
    public void paint(Graphics g) {
        //background 
        g.setColor(Color.black);
        g.fillRect(1, 1, 692, 592);

        //Borders
        g.setColor(Color.yellow);
        g.fillRect(0, 0, 3, 592);
        g.fillRect(0, 0, 692, 3);
        g.fillRect(691, 0, 3, 592);

        //the paddle
        g.setColor(Color.green);
        g.fillRect(playerX, 550, 100, 8);

        //the ball
        g.setColor(Color.yellow);
        g.fillOval(ballposX, ballposY, 20, 20);

        g.dispose();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        timer.start();
        if(play){
            //to make the ball bounce from the border
            if(new Rectangle(ballposX, ballposY,20,20).intersects(new Rectangle(playerX, 550, 100, 8))){
                ballYdir = -ballYdir;
            }
            //to move the ball
            ballposX += ballXdir;
            ballposY += ballYdir;
            if(ballposX < 0){
                ballXdir = -ballXdir;    
            }
            if(ballposY < 0){
                ballYdir = -ballYdir;    
            }
            if(ballposX > 670){
                ballXdir = -ballXdir;    
            }
        }
        
        
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    //move the player(the green rectangle)right& left
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (playerX >= 600) {
                playerX = 600;
            } else {
                moveRight();
            }

        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (playerX < 10) {
                playerX = 10;
            } else {
                moveLeft();
            }
        }
    }

    public void moveRight() {
        play = true;
        playerX += 20;
    }

    public void moveLeft() {
        play = true;
        playerX -= 20;
    }

}

