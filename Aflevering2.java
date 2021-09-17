import java.util.Scanner;

public class Aflevering2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in a number please ❤:");
        int testNum = sc.nextInt();
        //Using the if statement to compare the size of testNum against 0.
        if(testNum < 0) {
        System.out.println(testNum + " is a negative number!");}
        else if(testNum == 0) {
        System.out.println(testNum + " is zero");}
        else
        System.out.println(testNum + " is a positive number!");









    }
}
