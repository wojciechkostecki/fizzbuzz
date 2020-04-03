import java.util.stream.IntStream;

public class StreamVersion {
    public static void fizzBuzzStream() {
        IntStream.rangeClosed(1, 100)
                .mapToObj(x -> x % 3 == 0 ? (x % 5 == 0 ? x + " FizzBuzz" : x + " Fizz") : (x % 5 == 0 ? x + " Buzz" : x))
                .forEach(System.out::println);

    }
}
