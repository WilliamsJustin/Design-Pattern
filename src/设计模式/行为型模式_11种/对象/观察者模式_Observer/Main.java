package 设计模式.行为型模式_11种.对象.观察者模式_Observer;

public class Main {
    public static void main(String[] args) {

        NewsPublisher publisher = new NewsPublisher();

        // 添加订阅者
        NewsSubscriber subscriber1 = new NewsSubscriber("Alice");
        NewsSubscriber subscriber2 = new NewsSubscriber("Bob");

        publisher.registerObserver(subscriber1);
        publisher.registerObserver(subscriber2);

        // 发布新闻
        publisher.publishNews("COVID-19 outbreak in China.");

        // 移除订阅者
        publisher.removeObserver(subscriber1);

        // 发布新闻
        publisher.publishNews("New iPhone model released.");

        // 添加订阅者
        NewsSubscriber subscriber3 = new NewsSubscriber("Charlie");
        publisher.registerObserver(subscriber3);

        // 发布新闻
        publisher.publishNews("SpaceX launches new satellite.");
    }
}