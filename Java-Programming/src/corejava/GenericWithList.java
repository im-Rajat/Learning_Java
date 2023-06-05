package corejava;

import java.util.ArrayList;
import java.util.List;

public class GenericWithList {
    public static void main(String[] args) {

        //List<Integer>values = new ArrayList<Integer>();    // version 1.5
        List<Integer>values = new ArrayList<>();    // version 1.7
        values.add(4);  // Integer v = new Integer(4);
        values.add(5);  // argument is object not int
        values.add(8);
        values.add(2, 2);
        // values.add("2");    // error

        for (Integer i : values) {
            System.out.print(i + " ");
        }
    }
}