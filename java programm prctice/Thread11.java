public class Thread11 {
    public static void main(String[] args) {
        System.out.println("Start program..........");

        int x = 67 + 87;
        System.out.println("Value of x: " + x);


        Thread t = Thread.currentThread(); 
        String a = t.getName();
        System.out.println("Curre  nt running thread is: " + a);

        t.setName("MyNewThread");

        System.out.println("After changing, thread is: " + t.getName());
        try {
            Thread.sleep(5000);
        } catch (Exception e) {  
        }
                System.out.println("Ending of Program..........");

    }
}
