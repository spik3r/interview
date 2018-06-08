import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Answers {

    public static void main(String[] args) {
        Answers f = new Answers();
        f.getFibsBelow(12);
    }

    public List<Integer> getFibsBelow(final int max) {
        int first = 0;
        int second = 0;
        int num = 1;

        final List<Integer> fibs = new ArrayList<Integer>();
        if (max == 0) {
            return Collections.emptyList();
        }

        fibs.add(first);
        for (int i = 1; i <= max; i++) {
            if (num < max) {
                fibs.add(num);
            }
            first = second;
            second = num;
            num = first + second;
        }

        System.out.println(fibs);
        return fibs;
    }
}
