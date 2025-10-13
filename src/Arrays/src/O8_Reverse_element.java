public class O8_Reverse_element {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int left = 0;
        int right = arr.length-1;
        int temp=0;

        System.out.println("Before Reversing the array:");
        for(int num:arr){
            System.out.print(num+" ");
        }
        while(left <= right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left += 1;
            right -= 1;
        }

        System.out.println("\nAfter Reversing the array:");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
