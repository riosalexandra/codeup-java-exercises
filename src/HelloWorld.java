public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int myFavoriteNumber = 217;
        System.out.println(myFavoriteNumber);

        String myString = "Here's my string!";
//        String myString = a;
//        String myString = 3.14159;
        System.out.println(myString);

        double myNumber = 3.14159;
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
//
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        System.out.println(three);
//
//        int three = (int) "three";
//
//        int x = 4;
//        x += 5;
//        System.out.println(x);
//
//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);
//
//        int x = 10;
//        int y = 2;
//        x = x / y;
//        System.out.println(x);
//        y -= x;
//        System.out.println(y);

        int x = Integer.MAX_VALUE;
        System.out.println(x);
        x += 1;
        System.out.println(x);

    }
}
//public means the class- we are defining our class
//static is a keyword we'll learn more about later
//void means there is no return type and that it is just going to preform a task
//shortcut for "public static main void" is "psvm"
//system.out line means this is essentially our console.log- it prints out what we see in the console (shortcut for this is 'SOUT')


// syntax, types, and variables exercise below
//
//q1. Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
//
//q2. Create a String variable named myString and assign a string value to it, then print the variable out to the console
//
//q3. Change your code to assign a character value to myString. What do you notice?
//
//q4. Change your code to assign the value 3.14159 to myString. What happens?
//
//q5. Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
//
//q6. Change your code to assign the value 3.14 to myNumber. What do you notice?
//
//q7. Change your code to assign the value 3.14 to myNumber. What do you notice?
//
//q8. Change your code to assign the value 123 to myNumber.
//      Why does assigning the value 3.14 to a variable declared as a long not compile, but         assigning an integer value does?
//
//q9. Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
//
//q10. Copy and paste the following code blocks one at a time and execute them
// code pasted in lines 16-23
//
//q11. Try to create a variable named class. What happens?
//
//q12. Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?
//
//q13. Rewrite the following expressions using the relevant shorthand assignment operators:
//
//q14. What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?
//
//Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.