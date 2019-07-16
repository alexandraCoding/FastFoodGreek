/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.impl;

import food.interfaces.Onstick;
import food.interfaces.Pita;
import factory.interfaces.FastFoodFactory;
import fastfoodgreek.impl.onstick.Souvlaki;
import fastfoodgreek.impl.pita.Sandwich;

/**
 *
 * @author alexa
 */
public class SkgFactory implements FastFoodFactory{

    @Override
    public Pita createPita() {
return new Sandwich(); }

    @Override
    public Onstick createOnstick() {
return new Souvlaki();    }
    
}
