

package factory.impl;
import food.interfaces.Onstick;
import food.interfaces.Pita;
import factory.interfaces.FastFoodFactory;
import fastfoodgreek.impl.onstick.Kalamaki;
import fastfoodgreek.impl.pita.PitaGiro;


public class AthFactory implements FastFoodFactory{

    @Override
    public Pita createPita() {
return new PitaGiro();    }

    @Override
    public Onstick createOnstick() {
return new Kalamaki();    }

}