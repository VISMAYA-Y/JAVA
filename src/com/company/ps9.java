package com.company;

import java.util.concurrent.CyclicBarrier;

class Cylinder{
    private double radius;
    private double height;
    private double area;
    private double volume;

    public void setRadii(double v,double h){

     //If u take pi then it should be double !
     this.radius = Math.sqrt(v/(Math.PI*h));
        System.out.println(radius);
    }
    public void setHeight(double v , double r){
        this.height = v/(Math.PI*r*r);
        System.out.println(height);
    }
    public double getRadii(){
        return radius;
    }
    public double getHeight(){
        return height;
    }

    public double getsurface(){
        return area;  // Total Surface Area
    }
    public double setsurface(double radius, double height){
        this.area = 2 * Math.PI * radius * (radius + height);  // Total Surface Area
        return area;
    }
    public double getvolume(){
        return volume;  // Total Surface Area

    }
    public double setvolume(double radius, double height){
        this.volume = Math.PI * radius * radius * height; //volume
        return volume;
    }

}

class Constructor{
    Constructor(double v , double h){
        double radius;
        radius = Math.sqrt(v/(Math.PI*h));
        System.out.println(radius);
    }
}
class cons{
    cons(double v , double r){
        double height = v/(Math.PI*r*r);
        System.out.println(height);
    }
}

class Rectangle1{
    int length;
    int breadth;

    // Default constructor
    Rectangle1() {
        length = 4;
        breadth = 5;
        System.out.println("Default Rectangle: Length = " + length + ", Breadth = " + breadth);
        System.out.println("Area = " + (length * breadth));
    }

    // Overloaded constructor with parameters
    Rectangle1(int l, int b) {
        length = l;
        breadth = b;
        System.out.println("Custom Rectangle: Length = " + length + ", Breadth = " + breadth);
        System.out.println("Area = " + (length * breadth));
    }
}

public class ps9 {
    public static void main(String[] args) {
        Cylinder object = new Cylinder();
        System.out.println(object.getHeight());
        System.out.println(object.getRadii());
        object.setHeight(200.22,1222.00);
        object.setRadii(1022.00,2022.00);


        System.out.println(object.getsurface());
        System.out.println(object.getvolume());
        System.out.println(object.setvolume(20.00,50.00));
        System.out.println(object.setsurface(20.0,30.0));
        Constructor ob = new Constructor(20.0,10.0);
        cons ob1 = new cons(20.0,10.0);
        Rectangle1 r1 = new Rectangle1();        // calls default constructor
        Rectangle1 r2 = new Rectangle1(10, 6);

    }
}


