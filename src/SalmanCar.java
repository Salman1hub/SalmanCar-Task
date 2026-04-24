
public class SalmanCar {

    public static void main(String[] args) {
        System.out.println(" [Testing GasCar] ");
        Car gasCar = CarFactory.createCar(EngineType.GAS);
        gasCar.start();
        gasCar.accelerate();
        gasCar.accelerate();
        gasCar.brake();
        gasCar.brake();
        gasCar.stop();

        System.out.println("\n [Testing ElectricCar] ");
        Car electricCar = CarFactory.createCar(EngineType.ELECTRIC);
        electricCar.start();
        electricCar.accelerate();
        electricCar.accelerate();
        electricCar.brake();
        electricCar.brake();
        electricCar.stop();

        System.out.println("\n [Testing HybridCar] ");
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
        CarFactory.replaceEngine(gasCar, EngineType.ELECTRIC);
        gasCar.start();
        gasCar.accelerate();
        gasCar.brake();
        gasCar.stop();
    }
}
