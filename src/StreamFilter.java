import java.util.*;
import java.util.Arrays;
import java.util.stream.*;

public class StreamFilter {
    public static void main(String[] args) {

        List<String> products = Arrays.asList("Laptop", "Pen", "Notebook", "Headphones", "Smartphone");
        products.forEach(System.out::println);
        // TODO: Print the original list
        products.stream()
                .filter(x->x.length()>5).map(String::toUpperCase).sorted().forEach(System.out::println);


        // TODO: Filter names longer than 5 characters, convert to uppercase, sort, and collect into a list

        // TODO: Print the filtered list
    }
}
