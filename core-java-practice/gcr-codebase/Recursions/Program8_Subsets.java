import java.util.ArrayList;

public class Program8_Subsets {

    static void subset(int[] arr, int index, ArrayList<Integer> list) {

        if (index == arr.length) {
            System.out.println(list);
            return;
        }

        subset(arr, index + 1, list);

        list.add(arr[index]);
        subset(arr, index + 1, list);

        list.remove(list.size() - 1);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2};

        subset(arr, 0, new ArrayList<>());
    }
}