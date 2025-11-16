package bank;
class Account{
    Account(String name){
        this.name=name;
    }
    String accountName;
    private String name;
    public String getName(){
       return  this.name;
    }


    }

public class Bank {
    public static void main(String[] args) {
        Account a1=new Account("Ashish Kumar Sharma");
        System.out.println(a1.getName());
    }
}
