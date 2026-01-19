package com.JavaEncapsulation;

public class Encapsulation {
    public static void main(String[] args){
        PatientEncapsul patient=new PatientEncapsul();
        patient.setName("John");
        patient.setAge(35);
        System.out.println(patient.hashCode());
        System.out.println(patient);

    }
}
