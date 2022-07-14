package Chapter1;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.perfromQuack();
        mallard.perfromFly();

        Duck model = new ModelDuck();
        model.perfromFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.perfromFly();
    }
}
