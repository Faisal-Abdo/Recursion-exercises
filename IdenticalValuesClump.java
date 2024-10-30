import java.util.ArrayList;
import java.util.Arrays;

public class IdenticalValuesClump {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 4, 8, 1));
        System.out.println(groupSumClump(0, nums, 13));
    }

    public static boolean groupSumClump(Integer start, ArrayList<Integer> nums, Integer target) {
        if (start > nums.size() - 1) {
            return target == 0;
        }
        Integer currentElement = nums.get(start);
        Integer sumOfNumbers = 0;
        Integer count = 0;
        while (start + count < nums.size() && nums.get(start + count) == currentElement) {
            sumOfNumbers += currentElement;
            count++;
        }
        if (groupSumClump(start + count, nums, target - sumOfNumbers)) {
            return true;
        }
        if (groupSumClump(start + count, nums, target)) {
            return true;
        }
        if (target < 0) {
            return false;
        }
        return groupSumClump(start + count, nums, target);
    }
}