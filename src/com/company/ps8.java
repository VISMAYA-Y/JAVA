package com.company;
import java.util.Scanner;

class Employee {
    int salary;
    String name;

    public void takeip() {
        Scanner sc = new Scanner(System.in);
        System.out.print("salary: ");
        salary = sc.nextInt();

        sc.nextLine(); // FIX HERE After nextInt(), always add sc.nextLine(); before reading a string.

        System.out.print("name: ");
        name = sc.nextLine();
        sc.close();
    }

    public void getSalary() {
        System.out.println("salary of the employee is: " + salary);
    }

    public void printName() {
        System.out.println("name is: " + name);
    }

    public String setName(String lame) {
        name = lame;
        return name;
    }
}

class Cellphone{
    public void ring() {
        System.out.println("ringing........");
    }
    public void vibrate() {
        System.out.println("vibrating........");
    }
    public void muted() {
        System.out.println("muteddd.......");
    }

}

class square {
    public void side(int n) {
        System.out.println("the side is "+n);

    }
    public void area(int n) {
        System.out.println("area: "+n*n);

    }
    public void perimeter(int n) {
        System.out.println("perimenter: " +4*n);
    }
}
class Rectangle {
    public void side(int n) {
        System.out.println("the side is "+n);

    }
    public void area(int n) {
        System.out.println("area: "+n*n);

    }
    public void perimeter(int l,int b) {
        System.out.println("perimenter: " +2*(l+b));
    }
}

class Circle{
    public void diameter(int r) {
        System.out.println("the side is "+2*r);

    }
    public void area(int r) {
        System.out.println("area: "+ Math.PI * r * r);

    }
    public void circumference(int r) {
        System.out.println("perimenter: " +2*Math.PI*r);
    }
}
class Tommy{
    public void hitting(){
        System.out.println("hitting.....");
    }

    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}

    public class ps8 {
        public static void main(String[] args) {
            Employee obj = new Employee();
            obj.takeip();
            obj.getSalary();
            obj.printName();
            System.out.println(obj.setName("bubu"));

            Cellphone obj2 = new Cellphone();
            obj2.muted();
            obj2.ring();
            obj2.vibrate();

            square obj3 = new square();
            obj3.side(4);
            obj3.area(4);
            obj3.perimeter(2);

            Tommy obj4 = new Tommy();
            obj4.fire();
            obj4.run();
            obj4.hitting();

        }
    }


    //NOTE
/*Here you go — just the damn formulas 😄:

⸻

Circle
	•	Area = π × r²
	•	Perimeter = 2 × π × r
	•	Diameter = 2 × r

Square
	•	Area = a²
	•	Perimeter = 4 × a

Rectangle
	•	Area = l × b
	•	Perimeter = 2 × (l + b)

Done ✅*/
