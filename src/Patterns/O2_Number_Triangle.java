package Patterns;

public class O2_Number_Triangle {
    public static void main(String[] args){
        int range = 0;
        int n=9;
        for(int i=0;i<n;i++){
           for(int j=0;j<n-i;j++){
               range = j;
               System.out.print("  ");
           }
           for(int k=range;k<n;k++){
               System.out.print(i+1+"   ");
           }
            System.out.println();
        }
    }
}
