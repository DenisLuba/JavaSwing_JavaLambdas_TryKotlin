package lesson4;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {-2, -1, 0, 1, 2};
        for (int number : numbers) {
            if (number < 0) System.out.println(number);
        }

        IntStream.of(-2, -1, 0, 1, 2).filter(value -> value < 0).forEach(System.out::println);
    }
}
