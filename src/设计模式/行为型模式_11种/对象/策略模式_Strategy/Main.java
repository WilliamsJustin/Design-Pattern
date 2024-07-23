package 设计模式.行为型模式_11种.对象.策略模式_Strategy;

public class Main {
    public static void main(String[] args) {
        Character swordsman = new Character(new SwordsmanStrategy());
        swordsman.performAttack();
        swordsman.performDefend();

        Character magician = new Character(new MagicianStrategy());
        magician.performAttack();
        magician.performDefend();
    }
}