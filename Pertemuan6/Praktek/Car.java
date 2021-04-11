public class Car extends Vehicle{
    private boolean seatbelt  = false;

    Car(){

    }
    public void setSeatBelt(int seatbelt){
        if(seatbelt == 1){
            this.seatbelt = true;
        }

        else{
            this.seatbelt = false;
        }
    }

    public boolean getSeatBelt(){
        System.out.println("aktif= " + seatbelt);
        return seatbelt;
    }

}