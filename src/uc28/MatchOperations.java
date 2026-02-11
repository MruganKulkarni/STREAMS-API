package uc28;

import java.util.Arrays;
import java.util.List;

public class MatchOperations {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30, 45, 50);

        boolean allEven = numbers.stream()
                .allMatch(n -> n % 2 == 0);

        boolean anyGreaterThan40 = numbers.stream()
                .anyMatch(n -> n > 40);

        System.out.println("Are all numbers even? " + allEven);
        System.out.println("Is any number greater than 40? " + anyGreaterThan40);
    }
}
