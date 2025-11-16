public class Main1 {
public static void main(String[] args) {
    String a="AshishKumarSharma";
   /*  int len=a.length();
    String rev=" ";
    for(int i=len-1;i>=0;i--){
        rev=rev+a.charAt(i);
    }
    System.out.println(rev);*/
    StringBuffer sf=new StringBuffer(a);
    System.out.println(sf.reverse());

}
}
 