public class TenTimesValue {
    public static void main(String[] args) {
        int[] arr = {3,30};
        System.out.println(array220(arr,0));
    }
    public static boolean array220(int[] array, Integer index){
        if((array.length-index)<2){
            return false;
        }
        if(array[index+1]==array[index]*10){
            return true;
        } else {
            return array220(array,index+1);
        }
    }
}