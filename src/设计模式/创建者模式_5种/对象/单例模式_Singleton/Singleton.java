package 设计模式.创建者模式_5种.对象.单例模式_Singleton;

public class Singleton {
    private static Singleton instance;

    // 私有构造函数，禁止外部通过new创建对象
    private Singleton() {
    }

    // 静态方法，返回单例对象
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

