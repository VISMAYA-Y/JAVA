package com.company;

 class MyEmployee{
     private int id;
     private String name;

     public String getName() {
         return name;
     }
     public void  setName(String n){
         this.name = n;
     }
     public int setid(){
         return id;
     }
     public int getid(int n){
         this.id =n;
         return n;
     }

 }

    public class ch9_am{
        public static void main(String[] args) {
            MyEmployee harry = new MyEmployee();
            // harry.id = 45;
            // harry.name = "CodeWithHarry"; --> Throws an error due to private access modifier
            harry.setName("ghg");
            System.out.println(harry.getName());
            harry.setid();
            System.out.println(harry.getid(6));
        }
    }

