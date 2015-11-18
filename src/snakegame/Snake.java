/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame;

import grid.Grid;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author solomonszocs
 */
public class Snake {
    
    public Snake(Direction direction){
        this.direction = direction;
        
        
        body= new ArrayList<>();
        body.add(new Point (5, 5));
        body.add(new Point (5, 4));
        body.add(new Point (5, 3));
                
        
    }
    
    private Direction direction = Direction.LEFT;
    private ArrayList<Point> body;
    private Grid grid;
    
    public void draw(Graphics graphics){
        
    }
    
    
}
