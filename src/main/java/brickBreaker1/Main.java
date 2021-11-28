/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rannn
 */
package brickBreaker1;
import javax.swing.JFrame;
public class Main {
    public static void main(String[]args){
        JFrame obj = new JFrame();
        //create object for JFrame
        obj.setBounds(10,10,700,600);
        //for the width and height for JFrame window
        obj.setTitle("Breakout Ball");
        //title of window
        obj.setResizable(false);
        //the window can't change it is size
        obj.setVisible(true);
        //visible 
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Gameplay gameplay = new Gameplay();
        //create object for class gameplay
        obj.add(gameplay);
        //add gameplay(JPanel) into JFrame
        
    }
}
