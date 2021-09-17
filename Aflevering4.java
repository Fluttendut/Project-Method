import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Aflevering4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type in the first length of the triangle.");
        double lengthA = sc.nextInt();
        System.out.println("Please type in the second length of the triangle.");
        double lengthB = sc.nextInt();
        System.out.println("Please type in the third length of the triangle.");
        double lengthC = sc.nextInt();

        //I used Heron's formula to calculate the area of a triangle.
        double s = (lengthA + lengthB + lengthC) /2;
        //To be able to use Math.sqrt() I need to import java.lang.Math.sqrt
        //Math.sqrt() to calculate the square root.
        double area = Math.sqrt(s*(s-lengthA)*(s-lengthB)*(s-lengthC));
        System.out.println(area);










    }
}
