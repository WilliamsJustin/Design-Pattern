package 设计模式.结构性模式_7种.对象.代理模式_Proxy;

// 客户端 Client
public class Client {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        Proxy proxy = new Proxy(realSubject);
        // 通过代理对象来访问真实对象
        proxy.request();
    }
}

