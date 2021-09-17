import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Aflevering

{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int numberOne = sc.nextInt();
        System.out.println("Enter second cumber: ");
        int numberTwo = sc.nextInt();
        System.out.println("Enter third cumber: ");
        int numberThree = sc.nextInt();

        //Defining a array list of the type int and then initializing it.
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        //Adding numbers to my array list.
        myNumbers.add(numberOne);
        myNumbers.add(numberTwo);
        myNumbers.add(numberThree);

        //sort() is sorting the array from smallest to biggest int by default
        Collections.sort(myNumbers);

        System.out.println("The smallest number is: " + myNumbers.get(0));



    }



}
