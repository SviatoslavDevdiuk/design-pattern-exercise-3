package pizza;

import java.util.List;

public class CalconePizza extends Pizza {

    private double cost;
    private List<String> components;

    public CalconePizza(double cost, List<String> components) {
        this.cost = cost;
        this.components = components;
    }

    public void showPizzaInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "CalconePizza{" +
                "cost=" + cost +
                ", components=" + components +
                '}';
    }
}

