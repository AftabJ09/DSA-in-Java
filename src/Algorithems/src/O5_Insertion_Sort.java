public class O5_Insertion_Sort {
    public static int[] insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,5,10,7,14,12};
        for(int n: insertionSort(arr)){
            System.out.print(n+" ");
        }
    }
}
