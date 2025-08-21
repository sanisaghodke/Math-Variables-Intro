class Main {
  public static void main(String[] args) {

    //Use the // to create single line comments to either add info or to take out code for debugging

    System.out.println("Hello world!");

    //We will be using System.out.println and System.out.print throughout the year. Try using both below to see what the difference is!

    System.out.println("Hello");

    System.out.print("Hi");

    //ANSWER: 



    //Throughout the year this year we will need to store information. For that we will be using VARIABLES!

    //Java is an Object-Oriented programming language. All variables we use this year will either be OBJECTS or PRIMITIVES

    //There are 8 primitives in Java: int, byte, short, long, float, double, boolean, char

    //For AP we need to know: int, double, boolean

    //List examples of the types below and give definition
    //int (integer): primitive data type used to represent whole numbers.
    //double: a primitive data type used to store decimal numbers.
    //boolean: data type that can store one of two possible values: true or false

    //For now we are just going to work with primitive

    //Create 3 variables of each of the above types (USE GOOD CODING PRACTICE WHEN CREATING THE VARIABLES

    int number = 1;
    double exact_number = 2.4;
    boolean is_correct = false;



    //MATH TIME!

    //What are the math operators that we can use?
    //+ - * / %

    //Try doing some math operations with numbers. How can we check to see if the math worked?

    System.out.println ("4 + 5 =" + (4+5));
    System.out.println ("6 - 3 = " + (6-3));
    System.out.println ("2 * 5 = " + 2*5);
    System.out.println ("4 / 2 =" + 4/2);
    System.out.println ("6 % 4 = " + 6%4);


    //Create codes that will print the following:

    //Odd integers from 1 to 100, inclusive of both

    System.out.println("Odd integers from 1-100:");

    for (int i = 1; i <= 100; i++) {
      if (i % 2 == 1) {
        System.out.println(i);
      }
    }
    //All multiples of 3 from 1 to 100

    System.out.println("Numbers divisable by 3 from 3-100");

    for (int j = 3; j <= 100; j++) {
      if (j % 3 == 0) {
        System.out.println(j);
      }
    } 


    //Starting at 1000, print on the same line (with a - [hypthen] between each) all of the numbers that end in 0 going down to 0
  
    for (int k = 1000; k >= 0; k--) {

      if (k % 10 == 0) {
        System.out.print(k + "-");
      }
    }
  
  }
}
