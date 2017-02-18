package it.camille.test;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Camille on 2017/2/18.
 */
public class HelloWorld {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.forEach(s-> System.out.println(s));
    }
}
