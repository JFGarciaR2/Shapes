package domain.model;

public class Rectangle extends Square {
    private int height = 0;

    // get Height of the Rectangle object
    @ Override
    public int getHeight() {
        return height;
    }

    // set Height of the Rectangle object (Modifier)
    @ Override
    public void setHeight(int newHeight) {
        if(newHeight >= 0) {
            height = newHeight;
        }
    }

    public Rectangle(int newX, int newY, int newWidth, int newHeight) {
        super(newX, newY, newWidth);
        setHeight(newHeight);
    }

    public Rectangle(int newWidth,int newHeight){
        this(0, 0, newWidth, newHeight);
    }
}
