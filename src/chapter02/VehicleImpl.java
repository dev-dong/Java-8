package chapter02;

public class VehicleImpl implements Vehicle {
    
    // public으로 반드시 선언 - 오버라이딩 정의 생각
    @Override
    public int getSpeedLimit() {
        // SPEED_LIMIT 속성이 public static final로 인식된다.
        return Vehicle.SPEED_LIMIT;
    }
}
