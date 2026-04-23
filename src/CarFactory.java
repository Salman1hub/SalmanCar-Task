
public class CarFactory {

    public static Car createCar(EngineType type) {
        Car car = new Car();
        car.setEngine(createEngine(type));
        return car;
    }

    private static Engineable createEngine(EngineType type) {
        switch (type) {
            case GAS:
                return new GasEngine();
            case ELECTRIC:
                return new ElectricEngine();
            case HYBRID:
                return new HybridEngine(new GasEngine(), new ElectricEngine());
            default:
                throw new IllegalArgumentException("Invalid engine type: " + type);
        }
    }

    public static void installEngine(Car car, EngineType type) {
        car.setEngine(createEngine(type));
    }

}
