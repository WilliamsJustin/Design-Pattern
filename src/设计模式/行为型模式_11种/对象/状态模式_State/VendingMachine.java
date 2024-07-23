package 设计模式.行为型模式_11种.对象.状态模式_State;

// 环境类 VendingMachine
class VendingMachine {
    private State state;

    public VendingMachine(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void insertCoin() {
        state.insertCoin();
    }

    public void chooseProduct() {
        state.chooseProduct();
    }

    public void dispenseProduct() {
        state.dispenseProduct();
    }
}