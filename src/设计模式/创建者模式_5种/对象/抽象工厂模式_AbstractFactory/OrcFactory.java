package 设计模式.创建者模式_5种.对象.抽象工厂模式_AbstractFactory;

// OrcFactory具体工厂（兽人工厂）的代码如下：
public class OrcFactory extends RoleFactory {
    @Override
    public Role createRole() {
        return new Orc();
    }

    @Override
    public Weapon createWeapon() {
        return new Axe();
    }
}

