/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastfoodgreek.impl.onstick;

import food.interfaces.Onstick;

/**
 *
 * @author alexa
 */
public class Souvlaki implements Onstick{

    @Override
    public void eat() {
        System.out.println("Traditional very nice onStick souvlaki in SKG,"
                + "Beaware!!!! Dont order Kalamaki:"
                + "They gonna give you a straw");    }
    
}
