//This program prints the Average of an Array in Java

import java.util.Scanner;
public class ArrayValuesAverage {
    public static double average(int arr[])
    {
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            sum = sum + arr[i];
        }
        double avg = (double)sum/arr.length;
        return avg;

        /*Another Method -
        int sum = 0;
        int count = 0;
        for(int i=0;i<arr.length;i++)
        {
            sum = sum + arr[i];
            count++;
        }
        double avg = (double)sum/count;
        return avg;

        Here we can assign double datatype for sum & count 
        and if we do that,then we don't have to do type casting
        for avg variable.
        */
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter Array Values = ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(average(arr));
    }
}