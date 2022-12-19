//Recursion
import java.util.*;
public class Recurrsion {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        recur obj= new recur();
        System.out.println("Enter your choice \n1. power of number \n2.fibinocci  of number\n3.Factorial\n4.Counting in reverse manner\n5.spelling printing of number\n6. Check if given array is sorted or not\n7. Subset construction ");
        int choice= sc.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("Claculating power of no \nEnter the no u want power and extent");
                int num= sc.nextInt();
                int pow= sc.nextInt();
                int powerno=obj.power(num, pow);
                System.out.println("Power of "+num+" is "+powerno);
                break;
            case 2:
                System.out.println("Calucating fibinocci of no \nEnter the no u want factorial for\n");
                int num1= sc.nextInt();
                int fibno=obj.fib(num1);
                System.out.println("fibno of "+num1+" is "+fibno);
                break;
            case 3:
                System.out.println("Calucating factorial of no \nEnter the no u want factorial for\n");
                int num2= sc.nextInt();
                int factno=obj.fact(num2);
                System.out.println("fibno of "+num2+" is "+factno);
                break;
            case 4:
                System.out.println(" inverse counting from the no \nEnter the number\n");
                int num3= sc.nextInt();
                obj.count(num3);
                System.out.println("inverse counting from "+num3+" is done\n");

            case 5:
                System.out.println(" Spelling printing \nEnter the number\n");
                 int num4 = sc.nextInt();
                 obj.print(num4);
                System.out.println("Spelling of "+num4+" is printed\n");
            case 6:
                System.out.println(" Sorted or Un sorted array \nEnter the number of elents in array\n");
                int num5 = sc.nextInt();
                int[] a= new int[num5];
                System.out.println("Enter array elements\n");
                for (int i :a) {
                    a[i] = sc.nextInt();
                }
               boolean ans = obj.soru(a ,0);
                if(ans)
                    System.out.println("The given array is Sorted \n");
                else
                    System.out.println("The given array is UnSorted \n");


            default:
                System.out.println("This Program consists of power,factorial,fibinocci,inverse counting,spelling printing,To check if given array is sorted or not,Subset production of recurrsion func Try other choices also \n");
        }
    }
}

class recur{
    int power( int n, int m )
    {
        if(m==0)
            return 1;
        else
            return n*power(n,m-1);
    }
    int fib(int i )
    {
        if(i==0)
            return 0;
        if(i==1)
            return 1;
        else
            return (fib(i-1)+fib(i-2));
    }
    int fact(int f) {
        if (f == 1)
            return 1;
        else
            return f * fact(f - 1);
    }
    int count(int cno)
    {
        if (cno==0)
            return 0;
        else {
            System.out.println(cno);
            return count(cno-1);
        }
    }
    String arr[] ={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","nine"};
    void print(int word)
    {
        if(word==0)
            return;
        else
        {
         int div = word/10;
         print(div);
            System.out.println(arr[word%10]);

    }}
    boolean soru(int[] b, int index){
       if(index >= b.length)
           return true;
       if(b[index] < b[index])
           return false;
       return soru(b,index+1);
        }

}