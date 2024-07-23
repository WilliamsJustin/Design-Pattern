package 设计模式.行为型模式_11种.对象.观察者模式_Observer;

import java.util.ArrayList;
import java.util.List;

class NewsPublisher implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private String news;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(news);
        }
    }

    public void publishNews(String news) {
        this.news = news;
        System.out.println("Publishing news:" + news);
        notifyObservers();
    }
}