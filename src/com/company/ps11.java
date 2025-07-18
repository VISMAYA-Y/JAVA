package com.company;

// Question 1: Abstract pen and Question 2:FountainPen
abstract class Pen {
    abstract void write();
    abstract void refill();
}

// Concrete class
class FountainPen extends Pen {
    void write() {
        System.out.println("WRITING....");
    }

    void refill() {
        System.out.println("Refilling...");
    }

    void changeNib() {
        System.out.println("Changing nib...");
    }
}

// Question 3: Monkey, Human, Interface
class Monkey {
    void jump() {
        System.out.println("Jumping");
    }

    void bite() {
        System.out.println("Biting");
    }
}

interface BasicAni {
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAni {
    public void eat() {
        System.out.println("Eating");
    }

    public void sleep() {
        System.out.println("Sleeping");
    }
}

class Telephone {
    void ring() {
        System.out.println("ha mere dil ka telephone a bhajtha ringa ringa ");
    }

    void lift() {
        System.out.println("unchi hai building lift tere band hai ");
    }

    void disconnect() {
        System.out.println("diconnect babayyyeeyye");
    }
}

class SmartPhone extends Telephone {
    /*If a child class overrides a method, parent version is ignored completely —
    Java will NOT fall back to parent even if child version is empty or broken.*/
//    void ring(){ // 🔥 This OVERRIDES parent method, but does nothing!
//
//    }
    void lift(){ //🔥 This also OVERRIDES, but is empty!

    }
    void disconnect(){// 🔥 Again, overrides but no output!
}

    }


public class ps11 {
    public static void main(String[] args) {
        Pen p1 = new FountainPen();
        p1.refill();
        p1.write();

        FountainPen fp = new FountainPen();
        fp.changeNib();

        Human h = new Human();
        h.jump();
        h.bite();
        h.eat();
        h.sleep();
        BasicAni b = new Human(); // using interface type
        b.eat();// 🔥 This will now count as a usage of the interface method
        System.out.println("\n");

        //lesson learnt :
        System.out.println("----with the help of mix parent class and obect of chilclass----");
    Telephone ts = new SmartPhone();
    ts.disconnect();
    ts.lift();
    ts.ring();

        System.out.println("----chaloo experimentttt we can create object of child and access parent❌-----");
    SmartPhone sp = new SmartPhone();
    sp.lift();
    sp.disconnect();
    sp.ring();

//    SmartPhone sm = new Telephone();---> child cant make object of parent
        System.out.println("------parent ovject to access child insides❌-----  ");
        Telephone tt = new Telephone();
        tt.ring();
        tt.disconnect();
        tt.lift();
    }
}


//“Agar child ne ‘main karunga’ bol diya (override kar diya),
//to Java bolega — ‘Bas, ab tu hi karega. Mummy ko mat bula ab.’” 😎