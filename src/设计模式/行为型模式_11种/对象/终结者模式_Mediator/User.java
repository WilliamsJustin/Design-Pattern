package 设计模式.行为型模式_11种.对象.终结者模式_Mediator;

// 抽象同事对象 User
abstract class User {

    protected String name;
    protected ChatRoom chatRoom;

    public User(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        chatRoom.sendMessage(this, message);
    }

    public abstract void receiveMessage(User user, String message);
}
