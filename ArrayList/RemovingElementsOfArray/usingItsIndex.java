import java.util.*;
import java.util.ArrayList;
public class Solution{
    public static void main(String [] args){
        ArrayList<String> str= new ArrayList<String>(Arrays.asList("A","B","C","D"));
        str.remove(1);//removes element at index1
        System.out.println(str);
    }
}
