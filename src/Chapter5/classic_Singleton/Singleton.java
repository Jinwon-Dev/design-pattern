package Chapter5.classic_Singleton;

public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    // 기타 메소드
    public String getDescription() {
        return "I'm a classic Singleton!";
    }
}