package 设计模式.创建者模式_5种.对象.建造者模式_Builder;

// 定义一个抽象建造者Builder接口：
public interface Builder {
    void buildBody();

    void buildEngine();

    void buildTire();

    Car getResult();
}

