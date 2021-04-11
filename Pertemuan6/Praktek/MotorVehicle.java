public class MotorVehicle extends Vehicle {
    int sizeofEngine = 1;
    public String licencePlate = "H 1 IDN";

    MotorVehicle() {

    }

    public MotorVehicle(int sizeEng, String lcPlate) {
        this.sizeofEngine = sizeEng;
        this.licencePlate = lcPlate;

    }

    public int getSizeofEngine() {
        System.out.println(sizeofEngine);
        return sizeofEngine;
    }

    public String getLicencePlate() {
        System.out.println(licencePlate);
        return licencePlate;
    }
}