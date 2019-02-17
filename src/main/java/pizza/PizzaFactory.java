package pizza;

import java.util.ArrayList;

public class PizzaFactory {

    public Pizza create(PizzaType pizzaType, String pizzaName) {
        if (pizzaType.equals(PizzaType.CALCONE)) {
            return new CalconePizza(25, new ArrayList<String>());
        } else if (pizzaType.equals(PizzaType.HAWAI)) {
            return new HawaiPizza(35, new ArrayList<String>());
        } else if (pizzaType.equals(PizzaType.MARGHERITA)) {
            return new MargheritaPizza(20, new ArrayList<String>());
        }
        if (pizzaType.equals(PizzaType.CAPRICIOSA)) {
            return new CapriciosaPizza(30, new ArrayList<String>());
        }
        return null;
    }
}
