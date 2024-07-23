package 设计模式.行为型模式_11种.对象.策略模式_Strategy;

// 环境类 Character
class Character {
    private CombatStrategy combatStrategy;

    public Character(CombatStrategy combatStrategy) {
        this.combatStrategy = combatStrategy;
    }

    public void setCombatStrategy(CombatStrategy combatStrategy) {
        this.combatStrategy = combatStrategy;
    }

    public void performAttack() {
        combatStrategy.attacck();
    }

    public void performDefend() {
        combatStrategy.defend();
    }
}