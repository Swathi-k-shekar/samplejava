//        Take a number as input and print the multiplication table for it.


import java.util.Scanner;
public class multable {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no");
        int n=sc.nextInt();
       for (int i=1;i<=10;i++)
       {
           System.out.println(n+" X "+i+" = "+n*i);
       }
    }
}
