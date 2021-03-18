public class GameEnemy {
    // ATTRIBUTE
    double width;
    double height;
    int positionX;
    int positionY;
    
    //METHOD
    GameEnemy(){
            
    }
        
    GameEnemy(double width, double height){

    }
        
    void setDimension(double width, double height){
        this.width = width;
        this.height = height;

    }
    
    void setPosition(int positionX, int positionY){
        this.positionX = positionX;
        this.positionY = positionY;
    }
    
    double getWidth() {
        return width;
    }
    
    double getHeight() {
        return height;
    }
    
    int getPositionX() {
        return positionX;
    }
    
    int getPositionY() {
        return positionY;
    }
    
    void Run(){
        System.out.println("Enemy is running");
    }
}
