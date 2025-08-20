class Main {
  public static void main(String[] args) {

    //Use the // to create single line comments to either add info or to take out code for debugging

    //System.out.println("Hello world!");

    //We will be using System.out.println and System.out.print throughout the year. Try using both below to see what the difference is!

    int sesameCookiesSold, chocolateCookiesSold = 1; 
    sesameCookiesSold = chocolateCookiesSold;
    boolean spicy = true;
    double money = 1.50;
    System.out.println("How many sesame cookies did we sell?");
    System.out.println("Only " + sesameCookiesSold + "..."); //System.out.print just keeps printing on the same line while System.out.println prints and moves to the next line.

    System.out.println("I sold " + 1+1 );

    System.out.println("Odd numbers from 0 to 1000:");

    for(int count = 1; count <= 100; count=count+2) {
    System.out.print(count + " ");
    }
    
    System.out.println(" ");
    System.out.println("Multiples of 3 from 0 to 1000:");

    for (int threeMultiples = 1; threeMultiples <=100; threeMultiples=threeMultiples*3) {
    System.out.print( threeMultiples + " ");
    }
    
    System.out.println(" ");
    System.out.println("Numbers that end in zero from 1000 going down to 0");

    for(int hyphens = 1000; hyphens>0; hyphens=hyphens/10) {
    System.out.print(hyphens + "-");
    }

    //ANSWER: 

    //Throughout the year this year we will need to store information. For that we will be using VARIABLES!

    //Java is an Object-Oriented programming language. All variables we use this year will either be OBJECTS or PRIMITIVES

    //There are 8 primitives in Java: int, byte, short, long, float, double, boolean, char

    //For AP we need to know: int, double, boolean

    //List examples of the types below and give definition
    //int (integer): 
    //double:
    //boolean:

    //For now we are just going to work with primitive

    //Create 3 variables of each of the above types (USE GOOD CODING PRACTICE WHEN CREATING THE VARIABLES

    //MATH TIME!

    //What are the math operators that we can use?
    //+ - * / %

    //Try doing some math operations with numbers. How can we check to see if the math worked?

    //Create codes that will print the following:

    //Odd integers from 1 to 100, inclusive of both

    //All multiples of 3 from 1 to 100

    //Starting at 1000, print on the same line (with a - [hypthen] between each) all of the numbers that end in 0 going down to 0
  }
}
