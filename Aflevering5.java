import java.util.Scanner;

public class Aflevering5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type in your desired password: ");
        System.out.println("- A password must have at least eight characters\n" +
                "- A password must consists of only letters and digits\n" +
                "- It cannot contain the string \"secret\"\n" +
                "- The first character must not be a dash (-)");
        String password = sc.nextLine();
        int passwordLength = password.length();
        boolean isPasswordValid = true;
        if(passwordLength < 8)
        {
            System.out.println("Your password too short.");
            isPasswordValid = false;
            System.out.println("False");
            return;
        }

        if(password.charAt(0) == '-')
        {
            System.out.println("Your password cannot begin with a dash.");
            isPasswordValid = false;
            System.out.println("False");
            return;
        }

        for(int i = 0; i < passwordLength; i++)
        {
            //! we are testing for the reversed.
            //Character.isLetter() test if the character is a letter
            //Character.isDigit() test if the character is a digit
            // && is a boolian and, and that means that both conditions has to be met
            if(!Character.isLetter(password.charAt(i)) && !Character.isDigit(password.charAt(i)))
            {
                isPasswordValid = false;
                System.out.println("Your password can only contain letters and numbers.");
                System.out.println("False");
                return;
            }

        }
        //Contains() tests if the string contains a substring.
        if(password.contains("secret"))
        {
            isPasswordValid = false;
            System.out.println("Your password cannot contain the word \"secret\".");
            System.out.println("False");
            return;

        }
        System.out.println("Congrats, your password is valid!");
        System.out.println(isPasswordValid);






    }
}
