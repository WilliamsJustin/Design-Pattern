package 设计模式.行为型模式_11种.对象.终结者模式_Mediator;

// 具体同事对象 NormalUser
public class NormalUser extends User {
    public NormalUser(String name, ChatRoom chatRoom) {
        super(name, chatRoom);
    }

    @Override
    public void receiveMessage(User user, String message) {
        System.out.println("[" + name + "]收到来自[" + user.getName() + "]的消息：" + message);
    }
}
