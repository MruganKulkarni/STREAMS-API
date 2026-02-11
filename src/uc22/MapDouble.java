package uc22;

import java.util.Arrays;
import java.util.List;

public class MapDouble {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        numbers.stream()
                .map(n -> n * 2)
                .forEach(System.out::println);
    }
}
