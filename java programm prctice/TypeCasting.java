import java.util.*;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       try{
        int div=a/b;
       }
       catch(ArithmeticException e){
        System.out.println("a is not divisible by b");
       }
       catch(Exception e){
        System.out.println("not run");
        System.out.println(e.getMessage());

       }
       finally{
        System.out.println(" i am in final block ");
       }
    }
    
}
