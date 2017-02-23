/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Marcador;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;


public class Numeros {
   private City bog;
   private Robot dan;   
   private Thing esfera;
   
   public Numeros(){
       int c = 1, d = 1, e= 1, f=1;
       this.bog = new City(10, 10);
       this.dan = new Robot(bog, 6, 2, Direction.NORTH,37);
       while(c < 6){
       Wall bloqueo = new Wall(bog, c, 1, Direction.WEST);
       c++;
       }
       while(d < 6){
       Wall bloqueo = new Wall(bog, d, 4, Direction.WEST);
       d++;
       }
       while(e < 6){
       Wall bloqueo = new Wall(bog, e, 7, Direction.WEST);
       e++;
       }
       while(f < 6){
       Wall bloqueo = new Wall(bog, f, 10, Direction.EAST);
       f++;
       }
   }
}
  