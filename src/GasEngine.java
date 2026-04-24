
public class GasEngine extends Engineable {

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

        while (this.speed < speed) {
            increase();
        }
        while (this.speed > speed) {
            decrease();
        }

        System.out.println("GasEngine speed now:" + " " + speed + " km/h");
    }

}
