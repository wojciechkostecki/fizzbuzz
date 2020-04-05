import java.util.ArrayList;
import java.util.List;

public class ClassicVersion {
    public static void fizzBuzzClassic() {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            numbers.add(i + 1);
        }

        for (Integer number : numbers) {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println(number + " FizzBuzz");
            } else if (number % 3 == 0) {
                System.out.println(number + " Fizz");
            }else if (number % 5 == 0) {
                System.out.println(number + " Buzz");
            }
        }
    }
}
