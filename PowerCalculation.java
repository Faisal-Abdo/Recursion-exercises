public class PowerCalculation {
    public static void main(String[] args) {
        Integer exponents = powerN(2,4);
        System.out.println(exponents);
    }
    public static Integer powerN(Integer base, Integer n){
        if(n<=1){
            return base;
        }
        return base * powerN(base,n-1);
    }
}
