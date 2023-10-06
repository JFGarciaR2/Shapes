package domain.model;

public class Ellipse extends Circle {
    private int radius2 = 0;

    // get Radius2 of the Ellipse object
    public int getRadius2(){
        return radius2;
    }

    // set Radius2 of the Ellipse object (Modifier)
    public void setRadius2(int newRadius2){
        if(newRadius2 >= 0){
            radius2 = newRadius2;
        }
    }

    // get Area of the Ellipse object
    @Override
    public int getArea(){
        return (int) (Math.PI * getRadius() * getRadius2());
    }
    // get Perimeter of the Ellipse object
    @Override
    public int getPerimeter(){
        return (int) (2 * Math.PI * Math.sqrt((Math.pow(getRadius(), 2) + Math.pow(getRadius2(), 2)) / 2));
    }
    
    public Ellipse(int newX, int newY, int newRadius, int newRadius2){
        super(newX, newY, newRadius);
        setRadius2(newRadius2);
    }
    public Ellipse(int newRadius, int newRadius2){
        this(0, 0, newRadius, newRadius2);
    }
}
