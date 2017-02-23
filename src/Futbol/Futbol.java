/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Futbol;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

public class Futbol {
    
   private Robot jack;
   private City unal;
   private Thing balon;
   
   
   public Futbol(){
       this.unal = new City(10, 10);
       this.balon = new Thing (this.unal,9 ,9);
       this.jack = new Robot(unal, 9, 9, Direction.WEST);
   }
    public void advance(){
       this.jack.pickThing();
       this.jack.move();
       this.jack.move();
       this.jack.putThing();
    }
    public void advanceLeft(){int b= 0;
        this.jack.pickThing();        
        this.jack.turnLeft();
        this.jack.move();
        while(b < 3){
        this.jack.turnLeft();
        b++;
        }
        this.jack.putThing();
    }
  
    public void advanceRight(){  int a = 0;
        this.jack.pickThing();
        this.jack.move();
        this.jack.move();
        while(a < 3){
        this.jack.turnLeft();
        a++;
        }
        this.jack.move();
        this.jack.turnLeft();
        this.jack.putThing();
    }
}
