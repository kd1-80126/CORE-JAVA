import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class CompareString implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
    	int diff = (s1.length()-s2.length());
        return diff;
    }
}

public class Assignment10 {
    public static void main(String[] args) {
        List<String> s = new ArrayList<>();
        s.add("Akshaykumbhar");
        s.add("Manas");
        s.add("Anil");
        s.add("Prathamesh");

        CompareString c1 = new CompareString();

        String max_length = Collections.max(s, c1);
        System.out.println(max_length);
    }
}
