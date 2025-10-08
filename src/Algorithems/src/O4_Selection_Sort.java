public class O4_Selection_Sort {
    public static int[] selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min_idx = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min_idx] > arr[j]){
                    min_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {38,42,13,98,24,10,90,90,15,1};
        for(int n:selectionSort(arr)){
            System.out.print(n+" ");
        }
    }
}
