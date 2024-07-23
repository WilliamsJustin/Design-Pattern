package 设计模式.设计原则.开闭原则_OCP;

// 在使用邮件发送程序时，我们只需要根据需要选择不同的MailSender子类即可，而不需要修改原有的代码。例如：
public class MailClient {
    public static void main(String[] args) {

        // 发送普通邮件
        MailSender mailSender = new PlainMailSender();
        mailSender.sendMail("Hello,world!");

        // 发送加密邮件
        MailSender encryptedMailSender = new EncyptedMailSender();
        encryptedMailSender.sendMail("Hello,world!");


    }
}
