public class O7_Third_largest {
    public static void main(String[] args) {
        int[] arr = {789,123,76,787,45,23,12,786};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for(int num:arr){
            if(num > first){
                third = second;
                second = first;
                first = num;
            }else if(num > second){
                third = second;
                second = num;
            }else if(num > third){
                third = num;
            }
        }
        System.out.println(third);
    }
}
