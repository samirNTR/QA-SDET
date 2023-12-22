package JavaPrac1;

import java.util.*;
import java.util.stream.Collectors;

public class HelloWorld {
    public static void main(String[] args) {
        String str = "I love java java java";

        Map<String, Long> wordFrequency = Arrays.stream(str.trim().split("\\s+"))
                                                                           .collect(Collectors.groupingBy(
                                                                          word -> word, Collectors.counting()
                                                                                                                ));

        wordFrequency.forEach((word, count) -> System.out.println(word + ":" + count));
    }
}
