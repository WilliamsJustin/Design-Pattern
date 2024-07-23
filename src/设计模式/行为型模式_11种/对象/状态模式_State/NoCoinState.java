package 设计模式.行为型模式_11种.对象.状态模式_State;

// 具体状态类 NoCoinState（无硬币状态）
public class NoCoinState implements State {
    @Override
    public void insertCoin() {
        System.out.println("You inserted a coin.");
    }

    @Override
    public void chooseProduct() {
        System.out.println("Please insert a coin first.");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Please insert a coin first.");
    }
}