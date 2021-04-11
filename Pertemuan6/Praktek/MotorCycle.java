public class MotorCycle extends MotorVehicle{
    private int numGear = 0;

    MotorCycle(){

    }
    
    public void setGearFoot(int numGear){
        this.numGear = numGear;
    }

    public int getGearFoot(){
        
        System.out.println("Set Gear= " + numGear);
        return numGear;
    }
}
