//Add Clase To Github Repository with git add . (All) or git add Class(Shape.java)
//Add Comment with git commit -m "Messagge"

package domain.model;

public abstract class Shape{
    private int x = 0;
    private int y = 0;

    // Constructor
    public Shape(int newX, int newY){
        setX(newX);
        setY(newY);
    }
    
    // Default Constructor
    public Shape(){
    }
   
    // set X of the Shape object (Modifier)
    public void setX(int newX){
        if((newX >= 0) && (newX <= 1000)){
            x = newX;
        }
    }
    
    // get X of the Shape object
    public int getX(){
        return x;
    }
    
    // set Y of the Shape object (Modifier)
    public void setY(int newY){
        if((newY >= 0) && (newY <= 1000)){
            y = newY;
        }
    }

    // get Y of the Shape object    
    public int getY(){
        return y;
    }

    // get Area of the Shape object (Abstract)
    public abstract int getArea();
    // get Perimeter of the Shape object (Abstract)
    public abstract int getPerimeter();
}