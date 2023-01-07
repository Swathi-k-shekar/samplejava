import java.util.Scanner;

//        Take two numbers and print the sum of both.
public class sum {

        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a no");
            int a1=sc.nextInt();
            System.out.println("Enter another no");
            int a2=sc.nextInt();
           int sum =a1+a2;
            System.out.println("Sum = "+ sum);
        }
    }

