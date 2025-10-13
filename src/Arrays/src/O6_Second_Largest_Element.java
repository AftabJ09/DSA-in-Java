public class O6_Second_Largest_Element {
    public static int OptimalMethod(int[] arr){
        int max = Integer.MIN_VALUE;
        int second = Integer.MAX_VALUE;
        for(int num:arr){
            if(num>max){
                second=max;
                max=num;

            }else if( num < max && num > second){
                second=num;
            }
        }
        return second;

    }
    public static void main(String[] args) {
        int[] arr={12,35,1,10,34,1};
        int second = 0;
        int max =0;
        for(int i=1;i<arr.length;i++){
            if(arr[max] < arr[i]){
                second = max;
                max = i;
            }
            if(arr[i] > arr[second] && arr[max] >arr[i]){
                second = i;
            }
        }
        System.out.println("Second Max Number is : "+arr[second]+" ");
        System.out.println("Optimal Way Implemented using method and the answer is : "+OptimalMethod(arr));
    }
}
