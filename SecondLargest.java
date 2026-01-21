import java.util.Scanner;
public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter"+ n +"elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int seclar = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i] > largest){
                seclar = largest;
                largest = arr[i];
            }
            else if(arr[i]> seclar && arr[i] != largest){
            seclar = arr[i];
            }
        }
        if(seclar == Integer.MIN_VALUE){
            System.out.println("No Second largest element is found!");
        }
        else{
            System.out.println("Second Largest element is: " +seclar);
        }
        sc.close();
    }
    
}
