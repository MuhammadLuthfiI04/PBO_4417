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
        return this.width;
    }
    
    double getHeight() {
        return this.height;
    }
    
    int getX() {
        return this.positionX;
    }
    
    int getY() {
        return this.positionY;
    }
    
    void Run(){
        System.out.println("Enemy is running");
    }
}
