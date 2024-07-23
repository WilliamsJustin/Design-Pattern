package 设计模式.设计原则.依赖倒置原则_DIP;

// OrderServiceImpl类的代码如下：
public class OrderServiceImpl implements OrderService {
    @Override
    public boolean saveOrder(Order order) {
        // 保存订单到MySQL数据库种
        return true;
    }
}
