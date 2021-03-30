public class GamePlayer {
    // ATTRIBUTE
    double width;
    double height;
    int PositionX;
    int PositionY;
    
    //METHOD
    GamePlayer(){

    }

    public GamePlayer(double width, double height){
        this.width = width;
        this.height = height;
    }
    

    public GamePlayer (double width, double height, int PositionX, int PositionY){
        this.width = width;
        this.height = height;
        this.PositionX = PositionX;
        this.PositionY = PositionY;
    }

    public void setDimension(double width, double height){
        this.width = width;
        this.height = height;
    }

    public void setPosition(int PositionX, int PositionY){
        this.PositionX = PositionX;
        this.PositionY = PositionY;
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    public int getX(){
        return this.PositionX;
    }

    public int getY(){
        return this.PositionY;
    }

    public void run(){
        System.out.println("Player is running");
    }

    public void Run(int incrementX) {
        PositionX = PositionX + incrementX;
        System.out.println("Player still running...current X position= " + PositionX);
    }    
}
   
