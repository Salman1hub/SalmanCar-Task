
public class SalmanCar {

    public static void main(String[] args) {
        System.out.println(" [Testing Gas Car] ");
        Car gasCar = CarFactory.createCar(EngineType.GAS);
        gasCar.start();
        gasCar.accelerate();
        gasCar.accelerate();
        gasCar.brake();
        gasCar.brake();
        gasCar.stop();

        System.out.println("\n [Testing Electric Car] ");
        Car electricCar = CarFactory.createCar(EngineType.ELECTRIC);
        electricCar.start();
        electricCar.accelerate();
        electricCar.accelerate();
        electricCar.brake();
        electricCar.brake();
        electricCar.stop();

        System.out.println("\n [Testing Hybrid Car] ");
        Car hybridCar = CarFactory.createCar(EngineType.HYBRID);
        hybridCar.start();
        hybridCar.accelerate();
        hybridCar.accelerate();
        hybridCar.accelerate();
        hybridCar.accelerate();
        hybridCar.brake();
        hybridCar.brake();
        hybridCar.brake();
        hybridCar.brake();
        hybridCar.stop();

        System.out.println("\n [Testing Engine Replacement] ");
        System.out.println("Replacing Gas engine with Electric engine:");
        CarFactory.installEngine(gasCar, EngineType.ELECTRIC);
        gasCar.start();
        gasCar.accelerate();
        gasCar.brake();
        gasCar.stop();
    }
}
