import java.util.*;
import java.util.ArrayList;
public class Solution{
    public static void main(String [] args){
        ArrayList <Integer> arr =new ArrayList<Integer>();//Data type specific arrayList
        arr.add(1);
        arr.add(2);
        arr.add(3);
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
}