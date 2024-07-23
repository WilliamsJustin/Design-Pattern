package 设计模式.行为型模式_11种.对象.命令模式_Command;

// 调用者：物流运输中心 Invoker
class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }

    public void undoCommand() {
        command.undo();
    }
}
