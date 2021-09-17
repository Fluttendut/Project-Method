import java.util.Scanner;

public class Aflevering3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in a word please: ");
        String yourName = sc.nextLine();
        int nameLength = yourName.length();
        System.out.println(nameLength);

        int middle = nameLength / 2;

        //% 2  means remainder after divided by two.
        //If I divide the name length by two I want to see if something is left over or not.
        //That will determine if it's a odd or even letter word.
        if(nameLength % 2 == 0) {
        System.out.println("Your word has an even amount characters. \nThere is no middle character.\n");}

        //charAt() lets you find a specific character in a string.
        else{
        System.out.println("The middle character in your word  is " + yourName.charAt(middle));}





    }
}
