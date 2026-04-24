
public class ElectricEngine extends Engineable {

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

        while (this.speed < speed) {
            increase();
        }
        while (this.speed > speed) {
            decrease();
        }

        System.out.println("ElectricEngine speed now: " + " " + speed + " km/h ");
    }

}
