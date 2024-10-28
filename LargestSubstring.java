import java.util.Scanner;

public class LargestSubstring {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = obj.nextLine();
        System.out.print("Enter a sub-string: ");
        String subs = obj.nextLine();
        if (!word.isEmpty() && !subs.isEmpty()) {
            System.out.println(strDist(word, subs));
        }
    }

    public static Integer strDist(String str, String sub) {
        if (str.length() < sub.length() && !str.contains(sub)) {
            return 0;
        } else if (str.startsWith(sub) && str.endsWith(sub)) {
            return str.length();
        } else if (!str.startsWith(sub)) {
            return strDist(str.substring(1), sub);
        } else if (!str.endsWith(sub)) {
            return strDist(str.substring(0, str.length() - 1), sub);
        }
        return str.length();
    }
}