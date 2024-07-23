package 设计模式.结构性模式_7种.对象.享元模式_Flyweight;

// 具体享元 ConcreteFleweight
public class ConcreteFlyweight implements Flyweight {
    private final String internalState;

    public ConcreteFlyweight(String internalState) {
        this.internalState = internalState;
    }

    @Override
    public void operation(String externalState) {
        System.out.println("ConcreteFlyweight.operation() - internalState:" + internalState + ",externalState:" + externalState);
    }
}

