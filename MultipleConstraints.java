import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultipleConstraints {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 3, 6, 10, 1, 1));
        System.out.println(splitArray(numbers));
    }

    public static boolean splitArray(ArrayList<Integer> numberArray) {
        Integer sum = 0;
        for (Integer num : numberArray) {
            sum += num;
        }
        if (sum % 2 == 0) {
            return helper(numberArray, sum / 2, 0, 0, 0, 0);
        } else {
            return false;
        }
    }

    public static boolean helper(List<Integer> integerArray, Integer target, Integer index, Integer multiplesOf5, Integer multiplesOf3, Integer neither) {
        if (index > (integerArray.size() - 1)) {  //base case
            return multiplesOf3 == target && multiplesOf5 == target;
        }
        if (integerArray.get(index) % 5 == 0) {
            helper(integerArray, target, index + 1, multiplesOf5 + integerArray.get(index), multiplesOf3, neither);

        } else if (integerArray.get(index) % 3 == 0) {
            helper(integerArray, target, index + 1, multiplesOf5, multiplesOf3 + integerArray.get(index), neither);

        } else {
            helper(integerArray, target, index + 1, multiplesOf5, multiplesOf3, neither + integerArray.get(index));
        }
        if (multiplesOf5 == multiplesOf3 && index < (integerArray.size())) {
            if (neither % 2 == 0) {  //outliers could be distributed between groups in a way that will make two groups equal
                return true;
            } else {
                return helper(integerArray, target, index + 1, multiplesOf5, multiplesOf3, neither + integerArray.get(index));
            }
        }
        return helper(integerArray, target, index + 1, multiplesOf5, multiplesOf3, neither);
    }
}