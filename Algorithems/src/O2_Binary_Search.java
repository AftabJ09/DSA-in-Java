public class O2_Binary_Search {
    // Requires sorted array
    public static int binarySearch(int[] arr,int number){
        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid] == number){
                return mid;
            }else if(arr[mid] > number){
                high = mid-1;
            }else if(arr[mid] < number){
                low = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80};
        int number =60;
        int result = binarySearch(arr,number);
        if(result ==-1){
            System.out.println("Element not present in array");
        }else{
            System.out.println("Element present at index: "+result);
        }
    }
}
