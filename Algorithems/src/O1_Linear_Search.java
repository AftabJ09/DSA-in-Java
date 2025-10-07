public class O1_Linear_Search {
    public  static int search(int[] arr,int number){
        for(int i=0 ;i< arr.length;i++){
            if(arr[i] == number){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {45,23,100,17,900,450};
        int number = 100;
        int result = search(arr,number);
        if(result ==-1){
            System.out.println("Element not present in array");
        }else{
            System.out.println("Element present at index: "+result);
        }
    }
}
