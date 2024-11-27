import java.util.*;
import java.util.ArrayList;
public class Solution{
    public static void main(String [] args){
        ArrayList <Integer> arr =new ArrayList<Integer>();//Data type specific arrayList
        ArrayList a=new ArrayList();//can add elements of any data type
        arr.add(1);
        arr.add(2);
        a.add(1);
        a.add('S');
        System.out.println(a);
        System.out.print(arr.get(0));// use get() method to access elements
    }
}
