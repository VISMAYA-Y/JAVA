package com.company;
//INHERITANCE

class Animal{
    private String name= "dog";
    private int age=20;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("wow this is amazing "+name);
    }

    public void printme(){
        System.out.println("I am what");
    }
}


class dog extends Animal{
    private String name_dog="blacky";
    private int age=15;

    public String getName_dog() {
        return name_dog;
    }

    public void setName_dog(String name_dog) {
        this.name_dog = name_dog;
        System.out.println(name_dog);
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
        System.out.println(age);
    }

}

public class ch10_inheritance {
    public static void main(String[] args) {
        Animal objectbase = new Animal();
        String n1= objectbase.getName();
        int a1 = objectbase.getAge();
        System.out.println(n1);//
        System.out.println(a1);//
        objectbase.setName("doggy");//
        objectbase.setAge(5);//



        dog objectderive = new dog();
        System.out.println(objectderive.getName_dog());
        System.out.println(objectderive.getAge());
        objectderive.setName_dog("bruno");
        objectderive.setAge(3);


        //I’ll treat this Dog like a generic Animal… but behind the scenes, use Dog’s logic
        Animal a = new dog();  // base class reference, child class object
        //It called Dog’s getAge() — not Animal’s — because you overrode it.
        int aguu= a.getAge();  // actually calls Dog's getAge()
        System.out.println(aguu);
        a.setAge(7); // actually calls Dog's setAge()
        //Still prints "I am what" — because you didn’t override printme() in dog yet.
        a.printme();

    }
}

//    public class lolo extends ch10_inheritance{ -----> ERROR: Only one public class per file is allowed,
//}                                                       and the file name must match the public class name.
