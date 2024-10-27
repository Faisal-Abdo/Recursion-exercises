public class TriangleBlock {
    public static void main(String[] args) {
        Integer blocks = triangle(4);
        System.out.println(blocks);
    }

    public static Integer triangle(Integer n) {
        if (n <= 0) {
            return 0;
        }
        return n + triangle(n - 1);
    }
}