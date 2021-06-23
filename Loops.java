import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements you want to insert:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array:");
        int[] arr = new int[10];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are:");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
        }
        System.out.println("sum of arr:"+sum);
         
       
    }
    
}
