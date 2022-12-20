package com.company;
import java.util.*;
public class linearsearch {
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int in=sc.nextInt();
        System.out.println("Enter the elements");
        int[] a1= new int[in];
        for (int i:a1){
            i=sc.nextInt();
        }
        System.out.println("Enter the Key element");
        int key = sc.nextInt();
        lsearch obj=new lsearch();
       int  v=obj.linearSearch(a1, key);
        if(v==-1)
            System.out.println("Element not found");
        else
        System.out.println(key+" is found at index: "+v);
    }
}
class lsearch{
    public static int linearSearch(int[] arr, int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
}