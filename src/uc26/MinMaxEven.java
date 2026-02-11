package uc26;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinMaxEven {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(11, 22, 35, 40, 18, 27, 50);

        Optional<Integer> minEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .min(Comparator.naturalOrder());

        Optional<Integer> maxEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .max(Comparator.naturalOrder());

        if (minEven.isPresent()) {
            System.out.println("Minimum even number: " + minEven.get());
        } else {
            System.out.println("No even numbers found");
        }

        if (maxEven.isPresent()) {
            System.out.println("Maximum even number: " + maxEven.get());
        } else {
            System.out.println("No even numbers found");
        }
    }
}
