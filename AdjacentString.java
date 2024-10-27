import java.util.Scanner;

public class AdjacentString {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = obj.nextLine();
        System.out.println(allStar(word));
    }

    public static String allStar(String str) {
        if (str.length() <= 1) {
            return str;
        } else {
            Integer index = -1;
            String substring = str.substring(1);
            char[] stringArray = str.toCharArray(); //if a space occurs(non-adjacent) then 2 stars will occur
            index++;
            if (stringArray[index] == ' ') {
                return str.charAt(0) + allStar(substring);  // this will eliminate the second star
            } else {
                if (stringArray[index + 1] == ' ') {
                    return str.charAt(0) + allStar(substring); //and this will eliminate the first star
                } else {
                    return str.charAt(0) + "*" + allStar(substring);
                }
            }
        }
    }
}