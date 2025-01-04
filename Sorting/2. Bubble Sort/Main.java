import java.util.*;
public class Main{
    public static int[] bubbleSort(int [] arr){
        int n = arr.length;
        for(int i=n-1;i>=1;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return  arr;
    }
    public static void main(String[] args) {
        int [] arr={1,6,4,2,9,8,3};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
}
