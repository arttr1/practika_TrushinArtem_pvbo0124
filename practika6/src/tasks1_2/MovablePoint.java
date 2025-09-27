package tasks1_2;

import java.util.ArrayList;

public class MovablePoint implements Movable{
    int x, y, speedx, speedy;

    public MovablePoint(int x, int y, int speedx, int speedy){
        this.x = x;
        this.y = y;
        this.speedx = x;
        this.speedy = y;
    }

    @Override
    public void moveUp(){
        y += speedy;
    }
    @Override
    public void moveDown(){
        y -= speedy;
    }
    @Override
    public void moveRight(){
        x += speedx;
    }
    @Override
    public void moveLeft(){
        x -= speedx;
    }

    @Override
    public String toString(){
        String s = "[" + x + ", " + y + "]";
        return s;
    }

    public int getSpeedX(){
        return this.speedx;
    }
    public int getSpeedY(){
        return speedy;
    }

//    @Override
//    public ArrayList<Integer> getPosition(){
//        ArrayList<Integer> coords = new ArrayList<>();
//        coords.add(this.x);
//        coords.add(this.y);
//        return coords;
//    }

}
