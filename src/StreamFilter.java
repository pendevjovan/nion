import java.util.*;
import java.util.Arrays;
import java.util.stream.*;

public class StreamFilter {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer n : numbers) {
            if (n % 2 == 0) {
                evenNumbers.add(n * 2);
            }

        }
        System.out.println(evenNumbers);

    }
}
