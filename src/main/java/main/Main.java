package main;

import pizza.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        CapriciosaPizza capriciosaPizza = new CapriciosaPizza(31.99, Arrays.asList("cheese", "champignons", "ham"));
//        HawaiPizza hawaiPizza = new HawaiPizza(29.99, Arrays.asList("cheese", "pineaple", "ham"));
//        MargheritaPizza margheritaPizza = new MargheritaPizza(24, Arrays.asList("cheese"));
        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza pizza1 = pizzaFactory.create(PizzaType.CALCONE);
        Pizza pizza2 = pizzaFactory.create(PizzaType.MARGHERITA);
        Pizza pizza3 = pizzaFactory.create(PizzaType.CAPRICIOSA);
        Pizza pizza4 = pizzaFactory.create(PizzaType.HAWAI);


        pizza1.showPizzaInfo();
        pizza2.showPizzaInfo();
        pizza3.showPizzaInfo();
        pizza4.showPizzaInfo();
    }


}
