package 设计模式.创建者模式_5种.对象.抽象工厂模式_AbstractFactory;

// 在使用这些类的时候，我们可以像下面这样来使用：
public class Client {
    public static void main(String[] args) {
        RoleFactory humanFactory = new HumanFactory();
        Role human = humanFactory.createRole();
        Weapon sword = humanFactory.createWeapon();
        human.attack();
        sword.use();

        RoleFactory elfFactory = new ElfFactory();
        Role elf = elfFactory.createRole();
        Weapon bow = elfFactory.createWeapon();
        elf.attack();
        bow.use();

        RoleFactory orcFactory = new OrcFactory();
        Role orc = orcFactory.createRole();
        Weapon axe = orcFactory.createWeapon();
        orc.attack();
        axe.use();
    }
}

