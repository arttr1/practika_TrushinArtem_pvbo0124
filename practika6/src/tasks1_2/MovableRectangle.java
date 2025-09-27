package tasks1_2;

public class MovableRectangle implements Movable{
    MovablePoint pLD, pRU;

    public MovableRectangle(int x1, int y1, int x2, int y2,  int speedx, int speedy){
        this.pLD = new MovablePoint(x1, y1, speedx, speedy);
        this.pRU = new MovablePoint(x2, y2, speedx, speedy);
    }

    @Override
    public void moveUp(){
        pLD.moveUp();
        pRU.moveUp();
    }
    @Override
    public void moveDown(){
        pLD.moveDown();
        pRU.moveDown();
    }
    @Override
    public void moveRight(){
        pLD.moveRight();
        pRU.moveRight();
    }
    @Override
    public void moveLeft(){
        pLD.moveLeft();
        pRU.moveLeft();
    }

    @Override
    public String toString(){
        String s = "Left down point: " + pLD.toString() + "\nRight up point: " + pRU.toString();
        return s;
    }


}
