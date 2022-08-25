package Chapter8.simple_barista;

public class Tea {

    void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    public void boilWater() {
        System.out.println("물 끓이는 중");
    }

    public void steepTeaBag() {
        System.out.println("찻잎을 우려내는 중");
    }

    public void addLemon() {
        System.out.println("레몬을 추가하는 중");
    }

    public void pourInCup() {
        System.out.println("컵에 따르는 중");
    }
}
