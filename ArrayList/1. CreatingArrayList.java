import java.util.*;
import java.util.ArrayList;
public class Solution{
    public static void main(String [] args){
        ArrayList <Integer> arr =new ArrayList<Integer>();//Data type specific arrayList
        ArrayList a=new ArrayList();//can add elements of any data type
        arr.add(1);// use add methods to add element
        arr.add(2);
        // to add elements to specific index
        arr.add(2,3);
        a.add(1);
        a.add('S');
        System.out.println(a);

        //using arrays
        ArrayList<String> str= new ArrayList<String>(Arrays.asList("A","B","c"));
        System.out.println(str);

    }
}
