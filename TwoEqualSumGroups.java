import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoEqualSumGroups {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2, 3,5));
        System.out.println(splitArray(numbers));
    }

    public static boolean splitArray(ArrayList<Integer> numberArray) {
        Integer sum = 0;
        for (Integer num : numberArray) {
            sum += num;
        }
        if (sum % 2 == 0) {
            return helper(numberArray, sum / 2, 0);
        } else {
            return false;
        }
    }

    public static boolean helper(List<Integer> integerArray, Integer target, Integer index) {
        Integer isTarget = target - integerArray.get(index);
        if (index > (integerArray.size() - 1)) {
            return false;
        }
        if (isTarget == 0) {
            return true;
        }
        if (isTarget != 0) {
            return helper(integerArray, isTarget, index + 1);
        }
        return helper(integerArray, target, index+1);
    }
}