import java.util.*;
public class Selction1 {
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of n");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <arr.length; i++){
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i <arr.length-1; i++) {
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
             int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            
        }
        System.out.println("Sorted Array: ");
        printArray(arr);
    }
    
}
