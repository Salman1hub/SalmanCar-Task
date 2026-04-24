
public class CarFactory {

    public static Car createCar(EngineType type) {
        return new Car(createEngine(type));
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

    public static void replaceEngine(Car car, EngineType type) {
        car.setEngine(createEngine(type));
    }

}
