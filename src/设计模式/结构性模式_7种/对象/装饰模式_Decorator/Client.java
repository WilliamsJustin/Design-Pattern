package 设计模式.结构性模式_7种.对象.装饰模式_Decorator;

public class Client {
    public static void main(String[] args) {
        Car car = new SUV();
        System.out.println("Car description:" + car.getDesription());
        System.out.println("Car price:" + car.getPrice());

        // Add GPS
        car = new GPSDecorator(car);
        System.out.println("Car description:" + car.getDesription());
        System.out.println("Car price:" + car.getPrice());

        // Add leather seats
        car = new LeatherSeatsDecorator(car);
        System.out.println("Car description:" + car.getDesription());
        System.out.println("Car price:" + car.getPrice());
    }
}

