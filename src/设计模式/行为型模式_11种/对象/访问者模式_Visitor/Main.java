package 设计模式.行为型模式_11种.对象.访问者模式_Visitor;

public class Main {
    public static void main(String[] args) {

        ObjectStructure os = new ObjectStructure();

        os.add(new Hero("张飞", 100));
        os.add(new Hero("赵云", 80));

        os.add(new Equipment("铁剑", 20));
        os.add(new Equipment("皮甲", 30));

        Visitor attackVisitor = new AttackVisitor(20);
        Visitor defendVisitor = new DefendVisitor(10);

        os.accept(attackVisitor);
        os.accept(defendVisitor);
    }
}
