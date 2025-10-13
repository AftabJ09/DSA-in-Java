public class O5_Generate_all_Subarrays{
    static void  recursiveApproach(int[] arr,int start,int end){
        if(end == arr.length){
            return;
        }else if(start > end){
            System.out.println("start is set to 0");
            recursiveApproach(arr,0,end+1);
        }else{
            System.out.print("[");
            for(int k=start;k<end;k++){
                System.out.print(arr[k]+",");
            }
            System.out.print("]\n");
            recursiveApproach(arr,start+1,end);
        }
        return;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                System.out.print("[");
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+",");
                }
                System.out.print("]\n");
            }
        }
        System.out.println("Recursive approach\n");
        recursiveApproach(arr,0,0);
    }
}
