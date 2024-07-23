package 设计模式.结构性模式_7种.对象.代理模式_Proxy;

// 代理类 Proxy
public class Proxy implements Subject {
    private final RealSubject realSubject;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        // 在访问真实主题之前可以进行一些额外的操作
        System.out.println("Proxy.request() - before calling realSubject.request()");
        // 调用真实主题的方法
        realSubject.request();
        // 在访问真实主题之后可以进行一些额外的操作
        System.out.println("Proxy.request() - after calling realSubject.requst()");
    }
}

