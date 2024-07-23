package 设计模式.行为型模式_11种.对象.状态模式_State;

// 具体状态类 HasCoinState（有硬币状态）
public class HasCoinState implements State {
    @Override
    public void insertCoin() {
        System.out.println("You can't insert another coin.");
    }

    @Override
    public void chooseProduct() {
        System.out.println("Please select your product.");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Please select your product first.");
    }
}