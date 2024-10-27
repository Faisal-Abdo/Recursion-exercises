import java.util.Scanner;

public class ParenthesisExtraction {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = obj.nextLine();
        System.out.println(ParenthesisExtraction.parenthesis(word));
    }

    public static String parenthesis(String str) {
        StringBuilder withinParenthesis = new StringBuilder();
        if (str.charAt(0) != '(') {
            withinParenthesis.append(parenthesis(str.substring(1)));
        } else if (str.charAt(str.length() - 1) != ')') {
            withinParenthesis.append(parenthesis(str.substring(0, str.length() - 1)));
        } else {
            return str;
        }
        return withinParenthesis.toString();
    }
}