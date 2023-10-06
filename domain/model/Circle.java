package domain.model;

public class Circle extends Shape{
    private int radius = 0;

    // get Radius of the Circle object
    public int getRadius(){
        return radius;
    }

    // set Radius of the Circle object (Modifier)
    public void setRadius(int newRadius){
        if(newRadius >= 0){
            radius = newRadius;
        }
    }

    // get Area of the Circle object
    @Override
    public int getArea(){
        return (int) (Math.PI * Math.pow(getRadius(), 2));
    }
    // get Perimeter of the Circle object
    @Override
    public int getPerimeter(){
        return (int) (2 * Math.PI * getRadius());
    }

    public Circle(int newX, int newY, int newRadius){
        super(newX, newY);
        setRadius(newRadius);
    }
    public Circle(int newRadius){
        this(0, 0, newRadius);
    }
}
