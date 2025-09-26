package org.example;

public class Person {
    String firstname;
    String lastname;
    int age;
    String country;
    String hobby;
    String favouritePet;

   public Person(String firstname,
           String lastname,
           int age) {

        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Person(String firstname,
           String lastname,
           int age, String country) {

        this(firstname, lastname, age);
        this.country = country;
    }

    public Person(String firstname,
           String lastname,
           int age, String country, String hobby,
           String favouritePet) {

        this(firstname, lastname, age, country);
        this.hobby = hobby;
        this.favouritePet = favouritePet;
    }


    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        boolean sonuc = false;
        if (this.age <= 19 && this.age >= 13) sonuc = true;
        return sonuc;
    }
}
