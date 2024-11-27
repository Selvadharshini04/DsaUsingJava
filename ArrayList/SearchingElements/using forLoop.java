import java.util.*;
import java.util.ArrayList;
public class Solution{
    public static void main(String [] args){
        ArrayList<String> str= new ArrayList<String>(Arrays.asList("A","B","C","D"));
        for(String s:str){
            if(s.equals("C")){//checking if element exists or not
                System.out.println("The Element found");
                break;
            }
        }
    }
}
