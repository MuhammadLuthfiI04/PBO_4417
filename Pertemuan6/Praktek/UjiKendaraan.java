public class UjiKendaraan {
    static void KendaraanMelaju(Vehicle method){
        method.goStraight();
    }

    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Bicycle sepeda = new Bicycle();
        MotorVehicle motor = new MotorVehicle(1, "H 411 O");
        Car mobil = new Car();
        MotorCycle motor2 = new MotorCycle();

        kendaraan.turnRight();
        KendaraanMelaju(kendaraan);

        sepeda.ringBell();
        KendaraanMelaju(sepeda);

        motor.getSizeofEngine();
        motor.getLicencePlate();
        KendaraanMelaju(motor);

        motor2.setGearFoot(3);
        motor2.getGearFoot();
        KendaraanMelaju(motor2);

        mobil.setSeatBelt(1);
        mobil.getSeatBelt();
        KendaraanMelaju(mobil);

    }
}