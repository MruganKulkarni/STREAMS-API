package uc25;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstEven {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(11, 15, 20, 25, 30);

        Optional<Integer> firstEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .findFirst();

        if (firstEven.isPresent()) {
            System.out.println("First even number: " + firstEven.get());
        } else {
            System.out.println("No even number found");
        }
    }
}
