package 设计模式.设计原则.开闭原则_OCP;

// EncyptedMailSender类的代码如下：
public class EncyptedMailSender extends MailSender {
    @Override
    public void sendMail(String message) {
        System.out.println("Sending encrypted mail:" + encypt(message));
    }

    private String encypt(String message) {
        // 加密逻辑省略
        return message + "[encrypted]";
    }
}
