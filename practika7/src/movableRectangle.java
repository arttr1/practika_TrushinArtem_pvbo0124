public class movableRectangle implements movable{
    movablePoint topLeft;
    movablePoint bottomRight;

    public movableRectangle(movablePoint topLeft, movablePoint bottomRight){
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public boolean speedTest(){
        return (topLeft.xSpeed == bottomRight.xSpeed) && (topLeft.ySpeed == bottomRight.ySpeed);
    }


    @Override
    public void moveUp(){
        if (speedTest()){
            topLeft.moveUp();
            bottomRight.moveUp();
        }
        else{
            System.out.println("Скорости точек не совпадают");
        }
    }
    @Override
    public void moveDown(){
        if (speedTest()){
            topLeft.moveDown();
            bottomRight.moveDown();
        }
        else{
            System.out.println("Скорости точек не совпадают");
        }
    }
    @Override
    public void moveLeft(){
        if (speedTest()){
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
        else{
            System.out.println("Скорости точек не совпадают");
        }
    }
    @Override
    public void moveRight(){
        if (speedTest()){
            topLeft.moveRight();
            bottomRight.moveRight();
        }
        else{
            System.out.println("Скорости точек не совпадают");
        }
    }

    public String toString(){
        return "topLeft = " + topLeft + "\n" + "bottomRight = " + bottomRight; 
    }
}