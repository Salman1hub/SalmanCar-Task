
public abstract class Engineable {

    protected int speed = 0;

    public abstract void start();

    public abstract void stop();

    public abstract void setSpeed(int speed);

    public void increase() {
        speed++;
    }

    public void decrease() {
        speed--;
    }

}
