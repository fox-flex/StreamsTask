import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlattingTask {
    public static List<String> flattingStrings(List<String> words) {
        System.out.println();
        return words.stream()
                .flatMap(x -> x.chars().mapToObj(Character::toString))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(flattingStrings(Arrays.asList("aaa", "acs")));
    }
}
