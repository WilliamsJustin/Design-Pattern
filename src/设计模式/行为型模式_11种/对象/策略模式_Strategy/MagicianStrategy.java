package 设计模式.行为型模式_11种.对象.策略模式_Strategy;

// 具体策略类 MagicianStrategy（魔术师）
public class MagicianStrategy implements CombatStrategy {
    @Override
    public void attacck() {
        System.out.println("Magician attacks with magic spell!");
    }

    @Override
    public void defend() {
        System.out.println("Magician defends with magic ward!");
    }
}