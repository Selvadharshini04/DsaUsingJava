import java.util.*;
public class Main
{
	public static void main(String[] args) {
	
	    String s1="Hello world hello";
	    String [] s2=s1.split(" ");
	    StringBuilder result=new StringBuilder();
	    /-----------------------------Approach 1 using split() function----------------------------------------------------------------/
	    for(int i=s2.length-1;i>=0;i--){
	        System.out.print(s2[i]+" ");
	    }
     /-----------------------------Approach 2 using StringBuilder  function----------------------------------------------------------------/
	   /* int end=s1.length();
	    System.out.println(end);
	    for(int i=s1.length()-1;i>=0;i--){
	        if(s1.charAt(i)==' '){
	            result.append(s1.substring(i+1,end)).append(" ");
	            end=i;
	        }
	    }
	    result.append(s1.substring(0, end));
	    System.out.print(result);*/
	}
	
}
