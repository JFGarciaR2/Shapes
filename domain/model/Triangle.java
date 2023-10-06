package domain.model;

public class Triangle extends Shape{
    private int sideSize1 = 0;
    private int sideSize2 = 0;
    private int sideSize3 = 0;

    //SideSize1
    public int getSideSize1(){
        return sideSize1;
    }
    // set SideSize1 of the Triangle object (Modifier)
    public void setSideSize1(int newSideSize1){
        if(newSideSize1 >= 0){
            sideSize1 = newSideSize1;
        }
    }

    //SideSize2
    public int getSideSize2(){
        return sideSize2;
    }
    // set SideSize2 of the Triangle object (Modifier)
    public void setSideSize2(int newSideSize2){
        if(newSideSize2 >= 0){
            sideSize2 = newSideSize2;
        }
    }

    //SideSize3
    public int getSideSize3(){
        return sideSize3;
    }  
    // set SideSize3 of the Triangle object (Modifier)
    public void setSideSize3(int newSideSize3){
        if(newSideSize3 >= 0){
            sideSize3 = newSideSize3;
        }
    }


    //get semi-perimeter
    public int getSemiPerimeter(){
        return (getSideSize1() + getSideSize2() + getSideSize3()) / 2;
    }

    //get Area using Heron's formula
    @Override
    public int getArea(){
        return (int) Math.sqrt(getSemiPerimeter() * (getSemiPerimeter() - getSideSize1()) * (getSemiPerimeter() - getSideSize2()) * (getSemiPerimeter() - getSideSize3()));
    }
  
    // get Perimeter of the Triangle object
    @Override
    public int getPerimeter(){
        return getSideSize1() + getSideSize2() + getSideSize3();
    }

    public Triangle(int newX, int newY, int newSideSize1, int newSideSize2, int newSideSize3){
        super(newX, newY);
        setSideSize1(newSideSize1);
        setSideSize2(newSideSize2);
        setSideSize3(newSideSize3);
    }
    public Triangle(int newSideSize1, int newSideSize2, int newSideSize3){
        this(0, 0, newSideSize1, newSideSize2, newSideSize3);
    }


}
