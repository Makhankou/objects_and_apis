package collections;

import java.util.ArrayList;
import java.util.List;

public class ForEachWithLambdas {
    public static void printCollection_forEach() {
        List fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");

        fruits.forEach(f -> System.out.println(f));
        fruits.forEach(System.out::println);
        fruits.forEach(f -> {
            f = "fruits: " + f;
            System.out.println(f);
        });
    }

    public static void main(String[] args) {

    }
}
