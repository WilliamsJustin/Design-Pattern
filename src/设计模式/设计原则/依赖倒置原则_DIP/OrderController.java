package 设计模式.设计原则.依赖倒置原则_DIP;

// OrderController类的代码如下：
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    public boolean saveOrder(Order order) {
        return orderService.saveOrder(order);
    }
}
