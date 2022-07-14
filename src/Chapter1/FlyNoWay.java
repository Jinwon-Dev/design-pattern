package Chapter1;

public class FlyNoWay implements FlyBehavior { // 날 수 없는 오리들의 나는 행동을 구현
    public void fly() {
        System.out.println("저는 못 날아요");
    }
}
