package 设计模式.行为型模式_11种.对象.访问者模式_Visitor;

// 具体访问者2：防御访问者 DefendVisitor
public class DefendVisitor implements Visitor {
    private int damage;

    public DefendVisitor(int damage) {
        this.damage = damage;
    }

    @Override
    public void visit(Hero hero) {
        System.out.println("减少英雄" + hero.getName() + "的生命值");
        hero.attack -= damage;
    }

    @Override
    public void visit(Equipment equipment) {
        System.out.println("减少装备" + equipment.getName() + "的生命值");
        equipment.defense -= damage;
    }
}
