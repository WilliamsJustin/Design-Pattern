package 设计模式.创建者模式_5种.对象.抽象工厂模式_AbstractFactory;

// 具体产品——Bow类（弓）的代码如下：
public class Bow implements Weapon {
    @Override
    public void use() {
        System.out.println("Using bow");
    }
}

