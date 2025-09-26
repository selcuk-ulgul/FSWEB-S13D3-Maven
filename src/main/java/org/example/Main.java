package org.example;

public class Main {
    public static void main(String[] args) {

        Person person=new Person("Jobh","Doe",20);
        Person person1=new Person("Jobh","Doe",20,"Canada");
        Person person2=new Person("Jobh","Doe",20,"Canada","Tennis","Dog");
        System.out.println(person.firstname+"-"+person.lastname+"-"+person.age);
        System.out.println(person1.firstname+"-"+person1.lastname+"-"+person1.age+"-"+person1.country);

        System.out.println("Hello world");
    }
}
