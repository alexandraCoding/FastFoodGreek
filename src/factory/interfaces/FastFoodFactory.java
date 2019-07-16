/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.interfaces;

import food.interfaces.Onstick;
import food.interfaces.Pita;

/**
 *
 * @author alexa
 */
public interface FastFoodFactory {
   
    Pita createPita();
   
    Onstick createOnstick();
}
