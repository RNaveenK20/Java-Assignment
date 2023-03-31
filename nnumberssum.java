import java.util.Scanner;
public class nnumberssum{
    public static void main(String[] args){
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1,sum = 0;
        while(i<=num)
        {
            sum = sum+i;
            i++;
        }
        System.out.println("The Sum of n given natural numbers is " + sum);

    }
}