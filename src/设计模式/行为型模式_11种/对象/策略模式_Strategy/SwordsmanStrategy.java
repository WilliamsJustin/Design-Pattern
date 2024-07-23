package 设计模式.行为型模式_11种.对象.策略模式_Strategy;

// 具体策略类 SwordsmanStrategy（剑客）
class SwordsmanStrategy implements CombatStrategy {
    @Override
    public void attacck() {
        System.out.println("Swordsman attacks with sword!");
    }

    @Override
    public void defend() {
        System.out.println("Swordsman defends with shield!");
    }
}