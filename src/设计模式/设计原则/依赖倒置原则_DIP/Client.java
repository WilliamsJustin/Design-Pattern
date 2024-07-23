package 设计模式.设计原则.依赖倒置原则_DIP;

// 在使用这些类的时候，我们可以像下面这样来使用：
public class Client {
    public static void main(String[] args) {
        OrderService orderService = new OrderServiceImpl();
        OrderController orderController = new OrderController(orderService);
        Order order = new Order();

        boolean saved = orderController.saveOrder(order);
        System.out.println("Order saved:" + saved);
    }
}
