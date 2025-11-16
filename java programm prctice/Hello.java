
import java.util.*;
public class Hello {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter value of a");
        int a=sc.nextInt();
        System.out.println("enter value of b");
        int b=sc.nextInt();
        System.out.println("sum of a and b\n"+(a+b));
        System.out.println(a*b/a-b);
        System.out.println((a*b)/(a-b));
        
    }
    
}
