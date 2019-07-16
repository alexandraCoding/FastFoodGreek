/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastfoodgreek.impl.onstick;

import factory.impl.AthFactory;
import factory.impl.SkgFactory;
import food.interfaces.Pita;
import factory.interfaces.FastFoodFactory;
import food.interfaces.Onstick;

/**
 *
 * @author alexa
 */
public class FastFoodGreek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        FastFoodFactory  athFactory;
  athFactory= new AthFactory();
  Pita pita=athFactory.createPita();
  pita.eat();
  
   FastFoodFactory  skgFactory;
  skgFactory= new SkgFactory();
  Pita pita1;
        pita1 = skgFactory.createPita();
  pita1.eat();
  
  
     Onstick onstick1=athFactory.createOnstick();
  onstick1.eat();   
  
  
  Onstick onstick2=skgFactory.createOnstick();
  onstick2.eat(); 
    
    }
}
