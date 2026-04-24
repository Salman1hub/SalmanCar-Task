// 4. HybridEngine.java

public class HybridEngine extends Engineable {

    private GasEngine gasEngine;
    private ElectricEngine electricEngine;
    private Engineable currentEngine;

    public HybridEngine(GasEngine gasEngine, ElectricEngine electricEngine) {
        this.gasEngine = gasEngine;
        this.electricEngine = electricEngine;
        this.currentEngine = electricEngine;
    }

    @Override
    public void start() {
        currentEngine = electricEngine;
        electricEngine.start();
    }

    @Override
    public void stop() {
        if (currentEngine != null) {
            currentEngine.stop();
        }
    }

    @Override
    public void setSpeed(int speed) {
        if (speed < 50) {
            if (currentEngine != electricEngine) {
                currentEngine.stop();
                electricEngine.start();
                currentEngine = electricEngine;
            }
        } else {
            if (currentEngine != gasEngine) {
                currentEngine.stop();
                gasEngine.start();
                currentEngine = gasEngine;
            }
        }
        while (this.speed < speed) {
            increase();
        }
        while (this.speed > speed) {
            decrease();
        }

        currentEngine.setSpeed(speed);
    }
}
