package 设计模式.设计原则.开闭原则_OCP;

// PlainMailSender类（普通邮件发送）的代码如下：
public class PlainMailSender extends MailSender {
    @Override
    public void sendMail(String message) {
        System.out.println("Sending plain mail:" + message);
    }
}
