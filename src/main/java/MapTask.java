import java.util.List;
import java.util.stream.Collectors;

public class MapTask {
    public List<Integer> mapping(List<String> list) {
        return list.stream().filter(x -> {
            try {
                Integer.parseInt(x);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }).map(Integer::parseInt).collect(Collectors.toList());
    }
}
