class Pen {
    String color;
    String type;

    // Method
    public void write() {
        System.out.println("Hello, I am using a " + color + " " + type);
    }
}

public class Demo{
    public static void main(String args[]) {
        Pen p = new Pen();
        p.color = "red";
        p.type = "pen";
        p.write();
    }
}
