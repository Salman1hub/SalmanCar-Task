
public class Car {

    private Engineable engine;
    private int speed = 0;

    public void setEngine(Engineable engine) {
        this.engine = engine;
    }

    public void start() {
        speed = 0;
        engine.start();
    }

    public void stop() {
        if (speed == 0) {
            engine.stop();
        } else {
            System.out.println("Stop failed, the engine speed should be 0 km/h before stopping");
        }
    }

    public void accelerate() {
        if (speed < 200) {
            speed += 20;
            engine.setSpeed(speed);
        }
    }

    public void brake() {
        if (speed > 0) {
            speed -= 20;
            engine.setSpeed(speed);
        }
    }
}
