package 设计模式.行为型模式_11种.对象.命令模式_Command;

// 接收者：物流公司 Receiver
class Receiver {

    public void transportByTruck() {
        System.out.println("使用卡车进行运输");
    }

    public void undoTransportByTruck() {
        System.out.println("撤销卡车运输命令");
    }

    public void transportByShip() {
        System.out.println("使用船舶进行运输");
    }

    public void undoTransportByShip() {
        System.out.println("撤销船舶运输命令");
    }

    public void transportByAirplane() {
        System.out.println("使用飞机进行运输");
    }

    public void undoTransportByAirplane() {
        System.out.println("撤销飞机运输命令");
    }

}
