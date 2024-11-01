import java.util.*;
public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(2,8,9,7,3);
        nums.stream()
                     .sorted()
                              .map(n->n*2)
                                          .forEach(n->System.out.println(n));
    }
}
