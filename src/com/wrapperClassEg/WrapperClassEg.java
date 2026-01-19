package com.wrapperClassEg;

public class WrapperClassEg {
    public static void main(String[] args) {
        // boxing converting primitive to object class
        int num1 = 7;
        // Integer num2= new Integer(num1); this is boxing but depricated
        Integer num2 = num1;// autoboxing is happening
        System.out.println(num2);

        //unboxing is converting object to primitive
        String str= "12";
        int res= Integer.parseInt(str);// auto-unboxing
        System.out.println(res*2);
    }
}
