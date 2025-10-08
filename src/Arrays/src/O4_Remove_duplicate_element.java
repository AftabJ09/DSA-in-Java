import java.util.HashSet;

public class O4_Remove_duplicate_element {
    public static void optimalApproach(int[] arr){
        int index = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] != arr[i-1]){
                arr[index++] = arr[i];
            }
        }
        System.out.println("Optimal way..");
        for(int i=0;i<index;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,6};
        HashSet<Integer> result = new HashSet<>();
        int idx = 0;
        for(int num:arr){
            if(!result.contains(num)){
                result.add(num);
                arr[idx++] = num;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int num:result){
            System.out.print(num+" ");
        }
        System.out.println("Index size is: "+idx);
        optimalApproach(arr);
    }
}
