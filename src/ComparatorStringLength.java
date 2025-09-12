import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorStringLength {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("nizaniza");
        list.add("fegefefeefef");
        list.add("efefe");
        list.add("nfnifgnaizaniza");
        Comparator<String> comparator = new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                if(o1.length()<o2.length()) return -1;
                else return 1;
            }
        };
        list.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
    }
}