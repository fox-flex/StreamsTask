import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FizzBuzzTask {
    public static List<String> fizzBuzzIt(List<Integer> nums) {
        return nums.stream().
                flatMap(x -> x%15 == 0 ? Stream.of(x.toString(), "Fizz Buzz") :
                        x%3 == 0 ? Stream.of(x.toString(), "Fizz") :
                        x%5 == 0 ? Stream.of(x.toString(), "Buzz") :
                        Stream.of(x.toString()))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzzIt(Arrays.asList(1,2,3,5,15,22)));
    }
}
