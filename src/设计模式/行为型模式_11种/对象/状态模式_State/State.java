package 设计模式.行为型模式_11种.对象.状态模式_State;

// 抽象状态类 State
interface State {
    // 投入硬币
    void insertCoin();

    // 选择商品
    void chooseProduct();

    // 出货
    void dispenseProduct();
}