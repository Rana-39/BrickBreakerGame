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
