import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamVersion {
    public static void fizzBuzzStream() {
        IntStream.rangeClosed(1, 100)
                .mapToObj(x -> x % 3 == 0 ? (x % 5 == 0 ? x + " FizzBuzz" : x + " Fizz") : (x % 5 == 0 ? x + " Buzz" : x))
                .forEach(System.out::println);

    }

    public static void fizzBuzz() {
        Stream.iterate(1, n -> n + 1)
                .limit(100)
                .forEachOrdered(x -> {
                    if (x % 3 == 0 && x % 5 == 0) {
                        System.out.println(x + " FizzBuzz");
                    } else if (x % 3 == 0) {
                        System.out.println(x + " Fizz");
                    } else if (x % 5 == 0) {
                        System.out.println(x + " Buzz");
                    }
                });
    }
}
