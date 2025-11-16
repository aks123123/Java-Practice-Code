import java.util.*;
public class Array1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] no=new int[n];
        for(int i=0;i<n;i++){
            no[i]=sc.nextInt();

        }
        System.out.println("enter value of x");
        int x=sc.nextInt();
                for(int i=0;i<no.length;i++){
                    if(no[i]==x){
                        System.out.println("x is found");
                    }
                    else{
                        System.out.println("no id not found");
                    }
                   
                }

    }
    
}
