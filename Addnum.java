import java.util.Scanner;
public class Addnum{
    public static void main(String[] args){
        System.out.println("Enter the numbers to be added");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println("The Sum of two numbers is " + Integer.sum(a,b));
    }
}