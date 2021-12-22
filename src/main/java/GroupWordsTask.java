import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsTask {

    public static void groupIt(List<String> words) {
        HashMap<Character, List<String>> res1 = words.stream()
                .collect(Collectors.groupingBy(x -> x.charAt(0), HashMap::new, Collectors.toList()));
        Map<Character, Integer> res2 = res1
                .entrySet()
                .stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        x -> Integer.parseInt(x.getValue()
                                .stream()
                                .reduce("0", (num, str) -> String.valueOf(Integer.parseInt(num)
                                        + str
                                        .chars()
                                        .filter(ch -> ch == x.getKey())
                                        .count()
                                        )
                                )
                        )
                ));
        System.out.println(res2);
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("ABCA", "BCD", "ABC");
        groupIt(words);
    }
}
