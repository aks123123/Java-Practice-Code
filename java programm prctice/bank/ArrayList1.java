package bank;

import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(123);
        list.add(124);
        list.add(23);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.remove(1));
        System.out.println(list.set(0,1234));
        System.out.println( list.add(23));
        Collections.sort(list);
        System.out.println(list.addAll(Arrays.asList(12,34,45,46,456,65)));
        System.out.println(list);



    }
}
