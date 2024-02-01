public class Car {
    private Engine engine;

    public Car() {
        this.engine = new ElectricEngine();
    }
    public void start() {
        engine.turnOn();
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}