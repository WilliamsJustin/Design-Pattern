package 设计模式.行为型模式_11种.对象.观察者模式_Observer;

// 具体观察者类 NewsSubscriber（新闻订阅者）
public class NewsSubscriber implements Observer {

    private String name;

    public NewsSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " received news:" + news);
    }
}