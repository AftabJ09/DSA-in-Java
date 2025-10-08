import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class O2_Leader_In_Array {
    public static void main(String[] args) {
        int[] arr = { 16, 17, 4, 3, 5, 2 };
        ArrayList<Integer> leaders = new ArrayList<>();
        int current_leader = 0;
        for(int i=arr.length-1;i>=0;i--){
            if(current_leader<arr[i]){
                leaders.add(arr[i]);
                current_leader = arr[i];
            }
        }
        Collections.reverse(leaders);
        for(int leader:leaders){
            System.out.print(leader+" ");
        }
    }
}
//Leaders in an array