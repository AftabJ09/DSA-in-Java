public class O3_Check_If_Array_Is_Sorted {
    public static void main(String[] args) {
        int j = 1;
        boolean status = true;
        int[] arr = { 1,2,3,4,5};
        try {
            for (int i = 0; j < arr.length; i++) {
                if (arr[j] < arr[i]) {
                    status = !status;
                }
                j++;
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
        if(status){
            System.out.println("The array is Sorted");
        }else{
            System.out.println("The array is not sorted");
        }
    }
}
