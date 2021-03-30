public class GameEnemy {
    // ATTRIBUTE
    private double width;
    private double height;
    private int PositionX;
    private int PositionY;
    
    //METHOD
    public GameEnemy(){
            
    }
        
    public GameEnemy(double width, double height){
        this.width = width;
        this.height = height;
    }

    public GameEnemy (double width, double height, int PositionX, int PositionY){
        this.width = width;
        this.height = height;
        this.PositionX = PositionX;
        this.PositionY = PositionY;
    }
        
    public void setDimension(double width, double height){
        this.width = width;
        this.height = height;

    }
    
    public void setPosition(int positionX, int positionY){
        this.PositionX = positionX;
        this.PositionY = positionY;
    }
    
    public double getWidth() {
        return this.width;
    }
    
    public double getHeight() {
        return this.height;
    }
    
    public int getX() {
        return this.PositionX;
    }
    
    public int getY() {
        return this.PositionY;
    }
    
    public void Run(){
        System.out.println("Enemy is running");
    }
}
