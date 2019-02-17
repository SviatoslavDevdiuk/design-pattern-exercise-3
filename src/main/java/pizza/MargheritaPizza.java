package pizza;

import java.util.Arrays;
import java.util.List;

public class MargheritaPizza extends Pizza {

    public MargheritaPizza(double cost, List<String> components) {
        this.cost = cost;
        this.components = components;
    }

    public void showPizzaInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "MargheritaPizza{" +
                "cost=" + cost +
                ", components=" + components +
                '}';
    }
}
