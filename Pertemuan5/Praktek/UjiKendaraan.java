public class UjiKendaraan {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Bicycle sepeda = new Bicycle();
        MotorVehicle motor = new MotorVehicle(1, "H 411 O");

        sepeda.ringBell();
        motor.getSizeofEngine();
        motor.getLicencePlate();
        kendaraan.goStraight();
        kendaraan.turnLeft();

    }
}