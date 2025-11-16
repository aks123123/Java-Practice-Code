package bank;
import java.util.*;
public class SelectionSort {
    public static void printArr(int[] arr) {
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<n-1;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]) {
                    minIndex=j;
                }
                }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
            }
        printArr(arr);
        }
    }

