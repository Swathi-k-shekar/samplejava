//        Take 2 numbers as inputs and find their HCF and LCM.
import java.util.Scanner;
public class hcf {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a no");
        int a1=sc.nextInt();
        System.out.println("Enter another no");
        int a2=sc.nextInt();
        int temp1 = a1;
        int temp2 = a2;

        while(temp2 != 0){
            int temp = temp2;
            temp2 = temp1%temp2;
            temp1 = temp;
        }

        int hcf = temp1;
        int lcm = (a1*a2)/hcf;

        System.out.println("HCF of input numbers: "+hcf);
        System.out.println("LCM of input numbers: "+lcm);


    }
}
