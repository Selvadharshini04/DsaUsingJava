import java.util.*;
public class Main{
    public static int[] selectionSort(int [] arr){
        int n = arr.length;
        for(int i=0;i<n-2;i++){
            int min=i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        return  arr;
    }
    public static void main(String[] args) {
        int [] arr={1,6,4,2,9,8,3};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
}
