import java.util.ArrayList;
import java.util.Arrays;

public class Multiplesof5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2, 5, 10,1, 4));
        System.out.println(groupSum5(0, numbers, 19));
    }

    public static boolean groupSum5(Integer start, ArrayList<Integer> nums, Integer target) {
        if (start > nums.size() - 1) {
            return target == 0;
        }
        if (nums.get(start) % 5 == 0) {
            return groupSum5(start + 1, nums, target - nums.get(start));
        } else if ((start + 1) < nums.size() && nums.get(start + 1) == 1) {
            return groupSum5(start + 2, nums, target);    //skip '1' that is adjacent to multiples of 5
        }
        if (target < 0) {
            return false;
        }
        return groupSum5(start + 1, nums, target - nums.get(start)) || groupSum5(start + 1, nums, target);
    }
}