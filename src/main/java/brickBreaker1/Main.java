/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rannna
 */
package bbg;
import javax.swing.JFrame;
public class BBG {
public static void main(String[] args) {
 
 JFrame obj = new JFrame();
 GamePlay gameplay = new GamePlay();
    //create an object for GamePlay
 obj.setBounds(10,10,700,600);
    //height and width of window
 obj.setTitle("BrickBreaker");
    //the title of the window 
 obj.setResizable(false);
    //it can't change it's size
 obj.setVisible(true);
    //to make it visible 
 obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //exit,open and close the window 
 obj.add(gameplay);
    //called gameplay as argument in JFrame
 }
 

}
