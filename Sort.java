import java.util.Arrays;
import java.util.Comparator;

public class Sort {
    public static void sortNum(Integer[] uArr){
        Arrays.sort(uArr, new Comparator<Integer>() {
            @Override
            public int compare(Integer int1, Integer int2) {
                if ((int1%10 > int2%10))
                    return 1;
                else if (int1%10 == int2%10)
                    return 0;
                else return -1;
            }
        });
    }
}
