package 设计模式.结构性模式_7种.对象.外观模式_Facade;

// 客户端代码 Client
public class Client {
    public static void main(String[] args) {
        LoggerFacade logger = new LoggerFacade();
        logger.log("This is a log message.");
    }
}

