
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Denis
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Kitchener = new City();
        Robot denis = new Robot(Kitchener, 0, 2, Direction.WEST);
   
        new Wall (Kitchener, 0, 2, Direction.SOUTH);
        new Wall (Kitchener, 0, 1, Direction.SOUTH);
        new Wall (Kitchener, 1, 3, Direction.WEST);
        new Wall (Kitchener, 2, 3, Direction.WEST);
        new Wall (Kitchener, 2, 2, Direction.SOUTH);
        new Wall (Kitchener, 2, 1, Direction.SOUTH);
        new Wall (Kitchener, 2, 1, Direction.WEST);
        new Wall (Kitchener, 1, 1, Direction.WEST);
        
        denis.turnLeft();
        denis.turnLeft();
        denis.move();
        denis.turnLeft();
        denis.turnLeft();
        denis.turnLeft();
        denis.move();
        denis.move();
        denis.move();
        denis.turnLeft();
        denis.turnLeft();
        denis.turnLeft();
        denis.move();
        denis.move();
        denis.move();
        denis.turnLeft();
        denis.turnLeft();
        denis.turnLeft();
        denis.move();
        denis.move();
        denis.move();
        denis.turnLeft();
        denis.turnLeft();
        denis.turnLeft();
        denis.move();
        denis.move();
        denis.turnLeft();
        denis.turnLeft();   
    } 
}
