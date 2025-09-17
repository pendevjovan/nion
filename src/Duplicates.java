import java.util.*;
import java.util.Arrays;

public class Duplicates {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(6, 8, 2, 4, 4, 1);
        System.out.println(numbers);
        numbers.stream().sorted().distinct().forEach(System.out::print);

    }

}