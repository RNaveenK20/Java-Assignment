import java.util.Scanner;
public class Checknum
{
    public static void main(String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check : ");
        num = sc.nextInt();
        if(num>0)
        {
            System.out.println("The number is positive");
        }
        else if(num<0)
        {
            System.out.println("The number is negative");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}