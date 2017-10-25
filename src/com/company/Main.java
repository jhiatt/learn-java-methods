package com.company;

public class Main {

    public static void main(String[] args) {
	// Main method used to run all our code, stores all our other methods
        myName("jordan");
//        System.out.println(addNums(4,5) );
        int finalResult = addNums(4,5) + 10;
        anotherMethod();
        System.out.println(fullName("jordan", "hiatt") );
        System.out.println(finalResult);
    }

    // VOID: will return nothing (in itself)
    //New method, in order to see it in the console have to call it in main
    public static void myName(String mName) {
        System.out.println(mName);
    }

    public static int addNums(int a, int b) {
//        System.out.println("Sum: "+ (a + b) );
        int result = a + b;
        return(result);
    }

    public static void anotherMethod() {
        System.out.println("another method");
    }

    public static String fullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }
}
