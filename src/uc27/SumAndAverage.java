package uc27;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class SumAndAverage {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        // Using reduce() to calculate sum
        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("Sum: " + sum);

        // Using average() to calculate average
        OptionalDouble average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average();

        if (average.isPresent()) {
            System.out.println("Average: " + average.getAsDouble());
        } else {
            System.out.println("No values to calculate average");
        }
    }
}
