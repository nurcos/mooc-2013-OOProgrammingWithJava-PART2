package dungeon;

public class Player {
    private int x;
    private int y;
    private int length;
    private int height;
    
    public Player(int length, int height){
        this.x = 0;
        this.y = 0;
        this.length = length;
        this.height = height;
    }

    public void move(String input) {
        if(input.equals("w")){
            this.y -= 1;
        }
        else if(input.equals("a")){
            this.x -= 1;
        }
        else if(input.equals("s")){
            this.y += 1;
        }
        else if(input.equals("d")){
            this.x += 1;
        }
        
        if(this.getX() < 0){
                this.setX(0);
            }
            else if(this.getX() > this.length-1){
                this.setX(this.length-1);
            }
            else if(this.getY() < 0){
                this.setY(0);
            }
            else if(this.getY() > this.length-1){
                this.setY(this.length-1);
            }
    }
       
    public int getX(){
        return this.x;
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    public String toString(){
        return "@ " + this.x + " " + this.y;
    }
}
