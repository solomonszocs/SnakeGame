/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame;

import environment.Environment;
import grid.Grid;
import images.ResourceTools;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author solomonszocs
 */
class GrassEnvironment extends Environment {
    
    private Grid grid;
    private Snake bob;
    
    public GrassEnvironment() {
        this.setBackground(ResourceTools.loadImageFromResource("snakegame/grass.jpg"));
        grid = new Grid(25, 20, 20, 20, new Point(20, 50), Color.BLUE);
        bob = new Snake(Direction.LEFT);
        
    }

    @Override
    public void initializeEnvironment() {

    }

    @Override
    public void timerTaskHandler() {
        if (size >= 200) {
            multiplier = -1;
        } else if (size <= 10){
            multiplier = 1;
        }
        size = size + (change * multiplier);
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {

    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {

    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {

    }

    int size = 10;
    int change = 1;
    int multiplier = 1;
    
    @Override
    public void paintEnvironment(Graphics graphics) {
       
        if (grid != null){
            grid.paintComponent(graphics);
        }
        
//        graphics.setColor(Color.RED);
//
//        graphics.fillOval(50, 50, 50, 100);
//        
//        graphics.fillRect(400, 350, 50, 100);        
//        
//        graphics.setColor(Color.BLUE);
//        graphics.fillRect(this.getWidth() / 2 - size / 2, this.getHeight()/2 - size / 2, size, size);

    }

}
