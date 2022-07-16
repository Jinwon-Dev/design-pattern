package Chapter2;

public interface Subject {
    public void registerObserver(Observer o); // 옵저버를 등록하는 역할
    public void removeObserver(Observer o); // 옵저버를 제거하는 역할
    public void notifyObservers(); // 모든 옵저버에게 변경 내용을 알림
}