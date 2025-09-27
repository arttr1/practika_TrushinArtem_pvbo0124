package tasks1_2;

public class MovableCircle implements Movable{
    int radius;
    MovablePoint center;

    public MovableCircle(int x, int y, int speedx, int speedy, int radius) {
        this.center = new MovablePoint(x, y, speedx, speedy);
        this.radius = radius;
    }
    public MovableCircle(MovablePoint center, int radius){
        this.center = center;
        this.radius = radius;
    }

    @Override
    public void moveUp(){
        center.moveUp();
    }
    @Override
    public void moveDown(){
        center.moveDown();
    }
    @Override
    public void moveRight(){
        center.moveRight();
    }
    @Override
    public void moveLeft(){
        center.moveLeft();
    }

    @Override
    public String toString(){
        String s = "center = " + center.toString() + "\nradius = " + radius;
        return s;
    }


}
