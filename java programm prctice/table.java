import java.util.*;
public class table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of num");
       int num=sc.nextInt();
       System.out.println("table of num");
       for(int i=1;i<=10;i++){
         int res=num*i;
         System.out.println(num+"*"+i+"="+(res=num*i));
       }
    }
    
}
