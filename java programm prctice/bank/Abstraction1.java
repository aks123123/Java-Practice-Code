package bank;
abstract class Vicles{
    String color;

    abstract void Color();
}
class Bus extends Vicles{
    void Color(){
        System.out.println(" Car color is "+color+hashCode());
    }

}
class Truck extends Vicles{
    void Color(){
        System.out.println("Truck color"+color+hashCode());
    }
}
public class Abstraction1 {
    public static void main(String[] args) {
        Bus b1=new Bus();
        b1.color="red";
        b1.Color();
        Truck t1=new Truck();
        t1.color="pink";
        t1.Color();

    }
}
