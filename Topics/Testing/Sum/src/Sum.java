import java.util.ArrayList;

public class Sum {
    public Integer sum(ArrayList<Integer> list) {
        int result = 0;
        if (list == null) {
            return null;
        }
        for (Integer number : list) {
            result += number;
        }
        return result;
    }
}
