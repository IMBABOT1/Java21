package ru.imbabot.Lesson3.Phonebook;

public class Person{

    private String lastName;
    private int phone;

    public String getLastName(){
        return lastName;
    }

    public Person(String lastName, int phone){
        this.lastName = lastName;
        this.phone = phone;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }

        if (!(obj instanceof Person)){
            return false;
        }
        Person p = (Person)obj;
        return this.phone == p.phone && this.lastName == p.lastName;
    }

    @Override
    public int hashCode() {
        return lastName.hashCode() * phone * 28;
    }

    @Override
    public String toString() {
        return this.lastName + " " + this.phone;
    }
}

