class MyThread implements Runnable{
    public void run(){
        
        int n=4;
        for(int i=n;i>=1;i--){
            for(int j=0;j<=i;j++){
                System.out.print(1);
            }
            System.out.println( );
        }
    }

}public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        Thread t1=new Thread(t);
        t1.start();
        
    }
    
}
