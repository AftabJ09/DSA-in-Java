public class O3_Bubble_Sort {
    public static int[] bubbleSort(int[] arr){
        int temp;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            boolean status = false;
            for(int j=0;j<arr.length-1-i;j++){

                count += 1;
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    status = true;
                }
            }
            if(!status){
                break;
            }
        }
        System.out.println("The count is: "+count);
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {38,42,13,98,24,10,90,90,15,1};
        for(int n:bubbleSort(arr)){
            System.out.print(n+" ");
        }
    }
}
