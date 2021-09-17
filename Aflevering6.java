import java.util.Scanner;

public class Aflevering6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please a natural number. For example: 1, 20 or 34");
        int num = sc.nextInt();
        printNumbers(num);
    }

    //Making my own method allows me to bundle instructions to perform certain actions.
    //The parameters inside the method definition allow me to pass information into the method.
    static void printNumbers(int parameter)
    {
        //The variables defined inside the method are called arguments.
        int argument = parameter;
        for (int i = 0; i < argument; i++)
        {
            int numPlusOne = i + 1;
            System.out.println("[" + numPlusOne + "]");
        }
    }
}
