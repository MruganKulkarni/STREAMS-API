package uc23;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectList {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        List<Integer> doubledNumbers = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println(doubledNumbers);
    }
}
