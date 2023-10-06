package ui;

import domain.model.Ellipse;
import domain.model.Square;
import domain.model.Shape;
import domain.model.Rectangle;
import domain.model.Circle;

public class Test {
    public static void main(String[] args){

        /*
        var shape1 = new Shape(-200,10);
        var shape2 = new Shape(20,1500);

        
        System.out.println("Shape 1: " + shape1.getX() + ", " + shape1.getY());
        System.out.println("Shape 2: " + shape2.getX() + ", " + shape2.getY());
        */

        // var square = new Square();
        
        /*
        var rect = new Rectangle();

        rect.setX(50);

        System.out.println("Square: " + square.getWidth());
        System.out.println("Square: " + square.getX());
        

        rect.setWidth(100);

        System.out.println("Rectangle Width: " + rect.getWidth());
        System.out.println("Rectangle Height: " + rect.getHeight());
        */

        //rect.setHeight(21);
        
        /*
        System.out.println("Rectangle Width: " + rect.getWidth());
        System.out.println("Rectangle Height: " + rect.getHeight());
        */

        /*Test to Square Area 
        var s = new Square();
        s.setWidth(10);
        s.setHeight(20);

        System.out.println("Square Area " + s.getArea());
        System.out.println("Square Perimeter " + s.getPerimeter());
        */

        /*Test to Rectangle Area
        var r = new Rectangle();
        r.setWidth(10);
        r.setHeight(20);

        System.out.println("Rectangle Area " + r.getArea());
        System.out.println("Rectangle Perimeter " + r.getPerimeter());
        */

        var shapes = new Shape[]{
            new Rectangle(10, 20),
            new Circle(20),
            new Square(15),
            new Ellipse(5, 10),
            new Square(10)
        };
    
        var sumArea = 0;

        for(Shape s: shapes){
            sumArea += s.getArea();
        }

        var avgArea = sumArea / shapes.length;
        System.out.println("Average Area: " + avgArea);
    }
}

