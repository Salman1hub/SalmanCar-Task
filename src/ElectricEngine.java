
public class ElectricEngine extends Engineable {

    private int speed = 0;

    @Override
    public void start() {
        System.out.println("ElectricEngine started");
    }

    @Override
    public void stop() {
        System.out.println("ElectricEngine stopped ");
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("ElectricEngine speed now: " + " " + speed + " km/h ");
    }

}
