package com.company;

//parent circle
class Circle1{
        Circle1(double r){
            System.out.println("the area of circle is :"+Math.PI*r*r);
        }
    void cirvol1(double r){
        System.out.println("the circumeference of circle is :"+2*Math.PI*r);
    }
    Circle1(){
        System.out.println("SUPER-CLASS CONS");
    }

}
//child cylinder
class Cylinder1 extends Circle1{
    Cylinder1(double r , double h ){
        System.out.println("the area of cylinder is :"+2*Math.PI*r*h);
    }
    void cycvol(double r , double h ){
        System.out.println("the volume of cylinder is :"+Math.PI*r*r*h);
    }
    Cylinder1(){
        System.out.println("SUB-CLASS CONS");
    }
}


//parent rectangle
class Rectangle2{
    double l=10.0;
    double b=20.0;

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
        System.out.println(l);
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
        System.out.println(b);
    }

    Rectangle2(){
        System.out.println("SUPERCLASS RECTANGLE");
    }
}

// child cuboid
class cuboid extends Rectangle2{
double l=1.0;
double b=2.0;
double h=3.0;

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
        System.out.println(l);
    }

    @Override
    public double getB() {
        return b;
    }

    @Override
    public void setB(double b) {
        this.b = b;
        System.out.println(b);
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
        System.out.println(h);
    }

    cuboid(){
        System.out.println("SUBCLASS CUBOID\n");
    }
}


public class ps10 {
    public static void main(String[] args) {
//        When you create a child class object,
//        the constructor of the parent (superclass) is automatically called first —
//        even if you don’t write super() explicitly it automatically insert super(); before doing for subclass
        cuboid obj = new cuboid();
       Rectangle2 obj1 = new cuboid();
       Cylinder1 obj2 = new Cylinder1(2.0, 3.0);

    }
}
