package uc29;

import java.util.Arrays;
import java.util.List;

public class SortAscending {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(40, 10, 50, 20, 30);

        numbers.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
