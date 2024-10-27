
public class BunnyEars {
    public static void main(String[] args) {
        Integer test = bunnyEars2(3);
        System.out.print(test);
    }

    public static Integer bunnyEars2(Integer n) {
        if (n <= 0) {
            return 0;
        }
        Integer bunnyEars = 0;
        if (n % 2 != 0) {
            bunnyEars += 3;
            return bunnyEars + bunnyEars2(n - 1);
        } else {
            bunnyEars += 2;
            return bunnyEars + bunnyEars2(n - 1);
        }
    }
}
