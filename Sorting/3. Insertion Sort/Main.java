import java.util.*;
public class Main{
    public static int[] insertionSort(int [] arr){
        int n = arr.length;
        for(int i=0;i<=n-1;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        return  arr;
    }
    public static void main(String[] args) {
        int [] arr={1,6,4,2,9,8,3};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
}
