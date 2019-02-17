package pizza;

import java.util.List;

public class Pizza {
    private double cost;
    private List<String> components;

    public Pizza() {
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public List<String> getComponents() {
        return components;
    }

    public void setComponents(List<String> components) {
        this.components = components;
    }

    public void showPizzaInfo() {
        System.out.println(this.toString());
    }
}
