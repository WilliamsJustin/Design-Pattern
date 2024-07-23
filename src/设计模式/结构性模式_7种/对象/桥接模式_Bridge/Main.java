package 设计模式.结构性模式_7种.对象.桥接模式_Bridge;

public class Main {
    public static void main(String[] args) {
        // Create some car objects
        Car bmwSedan = new SedanCar(new BMW());
        Car audiSedan = new SedanCar(new Audi());

        // Show the details of different cars
        bmwSedan.showDetails();
        audiSedan.showDetails();
    }
}

