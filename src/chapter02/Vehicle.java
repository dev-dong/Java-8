package chapter02;

public interface Vehicle {
    // public static final로 인식
    int SPEED_LIMIT = 200;

    // public으로 인식
    public abstract int getSpeedLimit();
}
