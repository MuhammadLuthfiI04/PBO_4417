public class GamePlayer {
    // ATTRIBUTE
    double width;
    double height;
    int positionX;
    int positionY;
    
    //METHOD
    GamePlayer(){
        
    }
    
    GamePlayer(double width, double height, int positionX, int positionY){
        
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
        System.out.println("Player is running");
    }

    void Run(int incrementX ){
        incrementX = incrementX + positionX;
        System.out.println("Player still running...current X position = " + incrementX);
    }
}
