package com.Inheritance;

public class Doctor extends HospitalUser{
    String specialization;

    public Doctor(String name, int id, String specialization) {
        // this(); //calling this constructor is giveing error because we can call only 1 constructor in a class
        super(name, id);// calling the super class constructor to get name and id
        this.specialization = specialization;
    }

    public Doctor() {
        System.out.println("inside doctor default constructor");
    }

    void showDocDetils(){
        display(); // calling super class display()
        System.out.println("Specialization: "+ specialization);
    }

}
