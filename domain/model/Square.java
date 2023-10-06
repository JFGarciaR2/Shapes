package domain.model;

public class Square extends Shape {
    private int width = 0;

    // get Width of the Square object
    public int getWidth() {
        return width;
    }

    // set Width of the Square object (Modifier)
    public void setWidth(int newWidth) {
        if(newWidth >= 0) {
            width = newWidth;
        }
    }
    
    // get Height of the Square object
    public int getHeight() {
        return getWidth();
    }

    // set Height of the Square object (Modifier)
    public void setHeight(int newHeight) {
        setWidth(newHeight);
    }

    // get Area of the Square object
      @Override
    public int getArea() {
        return getWidth() * getHeight();
    }
    //get Perimeter of the Square object
    @Override
    public int getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    public Square(int newX, int newY, int newWidth) {
        //Super is equal to Father class
        super(newX, newY);
        setWidth(newWidth);
    }

    public Square(int newWidth) {
        this(0, 0, newWidth);
    }
    
}
