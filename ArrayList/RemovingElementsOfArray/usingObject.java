import java.util.*;
import java.util.ArrayList;
public class Solution{
    public static void main(String [] args){
        ArrayList<String> str= new ArrayList<String>(Arrays.asList("A","B","C","D"));
        str.remove("A");//removes element "A"
        System.out.println(str);
    }
}
