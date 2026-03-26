import java.util.*;

public class listSet {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Apple");

        System.out.println("List Elements:");
        for (String item : list) {
            System.out.println(item);
        }

        System.out.println("Element at index 1: " + list.get(1));

        list.remove("Banana");
        System.out.println("List after removing Banana: " + list);

        Set<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Apple");

        System.out.println("\nSet Elements:");
        for (String item : set) {
            System.out.println(item);
        }

        set.remove("Banana");
        System.out.println("Set after removing Banana: " + set);

        System.out.println("Does set contain Mango? " + set.contains("Mango"));
    }
}