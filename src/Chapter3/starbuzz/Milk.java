package Chapter3.starbuzz;

public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", 우유";
    }

    public double cost() {
        return .10 + beverage.cost();
    }
}
