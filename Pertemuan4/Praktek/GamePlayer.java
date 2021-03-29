public class GamePlayer {
    // ATTRIBUTE
    private double width;
    private double height;
    private int positionX;
    private int positionY;
    
    //METHOD
    public  GamePlayer(){
        
    }
    
    public GamePlayer(double width, double height, int positionX, int positionY){
        
    }
    
    public void setDimension(double width, double height){
        this.width = width;
        this.height = height;
    }

    public void setPosition(int positionX, int positionY){
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public int getX() {
        return this.positionX;
    }

    public int getY() {
        return this.positionY;
    }

    public void Run(){
        System.out.println("Player is running");
    }

    public void Run(int incrementX ){
        incrementX = incrementX + positionX;
        System.out.println("Player still running...current X position = " + incrementX);
    }
}
