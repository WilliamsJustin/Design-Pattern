package 设计模式.结构性模式_7种.对象.享元模式_Flyweight;

// 享元工厂 FlyweightFactory

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private final Map<String, Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyweight(String internalState) {
        // 如果已经存在相同内部状态的享元对象，则直接返回，否则创建新的享元对象
        if (flyweights.containsKey(internalState)) {
            return flyweights.get(internalState);
        } else {
            Flyweight flyweight = new ConcreteFlyweight(internalState);
            flyweights.put(internalState, flyweight);
            return flyweight;
        }
    }
}

