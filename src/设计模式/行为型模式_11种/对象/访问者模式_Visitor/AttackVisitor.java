package 设计模式.行为型模式_11种.对象.访问者模式_Visitor;

// 具体访问者1：攻击访问者 AttackVisitor
public class AttackVisitor implements Visitor {
    private int attack;

    public AttackVisitor(int attack) {
        this.attack = attack;
    }

    @Override
    public void visit(Hero hero) {
        System.out.println("增加英雄" + hero.getName() + "的攻击力");
        hero.attack += attack;
    }

    @Override
    public void visit(Equipment equipment) {
        System.out.println("增加装备" + equipment.getName() + "的攻击力");
        equipment.defense += attack;
    }
}
