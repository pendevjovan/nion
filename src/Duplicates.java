import java.util.*;
import java.util.Arrays;

public class Duplicates {

    public static void main(String[] args){

        List<String> names = Arrays.asList("Alice", "Bob", "Alice", "David", "Bob");

        // TODO: Print the original list
        System.out.println(names);

        // TODO: Convert the list to a LinkedHashSet to remove duplicates while preserving order
        Set<String> set = new LinkedHashSet<>(names);
        System.out.println(set);

        // TODO: Print the set of unique names

    }

}