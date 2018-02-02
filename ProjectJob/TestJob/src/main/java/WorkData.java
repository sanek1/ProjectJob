import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class WorkData {
    public int[] SortString(String value)
    {
        List<Integer> list = new ArrayList<Integer>();
        String[] numbers = value.split(";");
        Arrays.sort(numbers, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.valueOf(o1).compareTo(Integer.valueOf(o2));
            }
        });
        int[] array = Arrays.stream(numbers).mapToInt(Integer::parseInt).toArray();

        for(int i = 0; i < array.length; i++){
            if(array[i] %2 ==0)
                list.add(array[i]);
        }
        int[] array2 = list.stream().mapToInt(Integer::intValue).toArray();
        return array2;
    }
}
