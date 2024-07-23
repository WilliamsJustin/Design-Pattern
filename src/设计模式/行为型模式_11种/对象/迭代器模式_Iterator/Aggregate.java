package 设计模式.行为型模式_11种.对象.迭代器模式_Iterator;

// 抽象聚合对象 Aggregate
interface Aggregate {

    Iterator createIterator();

}
