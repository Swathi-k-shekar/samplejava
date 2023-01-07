
//        Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
import java.util.Scanner;
public class nsum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of numbers");
        int x=sc.nextInt();
        int res=0;
        for (int i = 0; i <x ; i++) {
            System.out.println("Enter the number");
            int n=sc.nextInt();
            res+=n;
        }
        System.out.println("Total sum = "+res);
    }
}
