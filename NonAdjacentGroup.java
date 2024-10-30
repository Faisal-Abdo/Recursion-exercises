import java.util.ArrayList;
import java.util.Arrays;

public class NonAdjacentGroup {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 5, 10, 4));
        System.out.println(groupNoAdj(0, arr, 12));
    }

    public static boolean groupNoAdj(Integer start, ArrayList<Integer> nums, Integer target) {
        if (!nums.isEmpty()) {
            return helper(start, nums, target, 0, 0);
        } else {
            return false;
        }
    }

    public static boolean helper(Integer index, ArrayList<Integer> numbers, Integer target, Integer group1, Integer group2) {

        if (index > (numbers.size() - 1)) {
            return group1 == target || group2 == target;
        }
        Integer currentElement = numbers.get(index);
        if (index % 2 == 0) {
            return helper(index + 1, numbers, target, group1 + currentElement, group2);
        } else if (index % 2 != 0) {
            return helper(index + 1, numbers, target, group1, group2 + currentElement);

        }
        return group1 == target || group2 == target;
    }
}
