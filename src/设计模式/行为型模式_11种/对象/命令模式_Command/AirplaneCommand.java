package 设计模式.行为型模式_11种.对象.命令模式_Command;

// 具体命令：飞机运输命令 AirplaneCommand
public class AirplaneCommand implements Command {

    private Receiver receiver;

    public AirplaneCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.transportByAirplane();
    }

    @Override
    public void undo() {
        receiver.undoTransportByAirplane();
    }
}
