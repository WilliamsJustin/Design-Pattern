package 设计模式.创建者模式_5种.对象.抽象工厂模式_AbstractFactory;

// 具体产品——Elf类（精灵）的代码如下：
public class Elf implements Role {
    @Override
    public void attack() {
        System.out.println("Elf attacking with bow");
    }

}

