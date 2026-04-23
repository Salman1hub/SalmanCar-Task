
public class GasEngine extends Engineable {

    private int speed = 0;

    @Override
    public void start() {
        System.out.println("GasEngine started ");
    }

    @Override
    public void stop() {
        System.out.println("GasEngine stopped ");
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("GasEngine speed now:" + " " + speed + " km/h");
    }

}
