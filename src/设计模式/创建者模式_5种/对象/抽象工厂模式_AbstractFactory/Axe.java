package 设计模式.创建者模式_5种.对象.抽象工厂模式_AbstractFactory;

// 具体产品——Axe类（斧头）的代码如下：
public class Axe implements Weapon {
    @Override
    public void use() {
        System.out.println("Using axe");
    }
}

