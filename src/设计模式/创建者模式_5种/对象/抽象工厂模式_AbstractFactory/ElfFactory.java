package 设计模式.创建者模式_5种.对象.抽象工厂模式_AbstractFactory;

// ElfFactory具体工厂（精灵工厂）的代码如下：
public class ElfFactory extends RoleFactory {
    @Override
    public Role createRole() {
        return new Elf();
    }

    @Override
    public Weapon createWeapon() {
        return new Bow();
    }
}

