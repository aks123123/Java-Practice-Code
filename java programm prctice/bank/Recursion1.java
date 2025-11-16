package bank;

public class Recursion1 {
    public static void printSum(int i,int sum,int n){
         if(i==n){
             sum+=i;
             System.out.println(sum);
             return;
         }
        sum+=i;
        printSum(i+1,sum,n);
    }
    public static void main(String[] args) {
        printSum(0,0,5);

    }
}
