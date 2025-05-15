package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        // add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // add at index
        fruits.add(1, "Orange");

        // get element
        System.out.println("1st fruit: " + fruits.get(0));

        // update element
        fruits.set(2, "Pineapple");

        // check if list contains something
        System.out.println("Contains Banana? " + fruits.contains("Banana"));

        // index of element
        System.out.println("Index of Mango: " + fruits.indexOf("Mango")); // -1 (replaced)

        // remove element
        fruits.remove("Orange");

        // size of list
        System.out.println("Size: " + fruits.size());

        // print all elements
        System.out.println("Fruits List:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }


}
