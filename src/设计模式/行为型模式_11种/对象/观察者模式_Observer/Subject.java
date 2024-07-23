package 设计模式.行为型模式_11种.对象.观察者模式_Observer;

// 抽象主题类 Subject
interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}