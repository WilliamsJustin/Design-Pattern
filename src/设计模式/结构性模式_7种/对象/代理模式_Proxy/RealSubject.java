package 设计模式.结构性模式_7种.对象.代理模式_Proxy;

// 真实主题 RealSubject
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("RealSubject.request()");
    }
}

