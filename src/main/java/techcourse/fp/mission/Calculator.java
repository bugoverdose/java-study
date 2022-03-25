package techcourse.fp.mission;

import java.util.List;
import java.util.function.IntPredicate;

public class Calculator {

    public static int sumAll(List<Integer> numbers) {
        return sum(numbers, always -> true);
    }

    public static int sumAllEven(List<Integer> numbers) {
        return sum(numbers, number -> number % 2 == 0);
    }

    public static int sumAllOverThree(List<Integer> numbers) {
        return sum(numbers, number -> number > 3);
    }

    public static int sum(List<Integer> numbers, IntPredicate condition) {
        return numbers.stream()
                .filter(condition::test)
                .reduce(0, Integer::sum);
    }
}
