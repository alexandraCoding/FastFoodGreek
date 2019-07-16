/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastfoodgreek.impl.pita;

import food.interfaces.Pita;

/**
 *
 * @author alexa
 */
public class Sandwich implements Pita{

    @Override
    public void eat() {
        System.out.println("In SKG,"
                + " they are not informed that sandwich is not pita,"
                + " but its tasty ,SO eat it");    }
    
}
