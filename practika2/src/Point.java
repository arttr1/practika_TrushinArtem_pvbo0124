public class Point{
    int x = 0, y = 0;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    Point(){
        this.x = 0;
        this.y = 0;
    }
    void setX(int x){
        this.x = x;
    }
    void setY(int y){
        this.y = y;
    }
    void show(){
        System.out.print(x + " ");
        System.out.print(y + "\n");
    }
    int[] get(){
        int[] coords = {this.x, this.y};
        return coords;
    }
}