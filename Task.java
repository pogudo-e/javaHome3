import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        Integer[] arr = {31, 25,50,66,12,13,84,99,585,87};

        System.out.println(Arrays.toString(arr));

        Sort.sortNum(arr);
        System.out.println(Arrays.toString(arr));
    }
}