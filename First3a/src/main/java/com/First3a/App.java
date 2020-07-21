package com.First3a;
import java.util.*;
import java.util.stream.Collectors;
public class App 
{
    public static void main( String[] args )
    {
    	 Scanner sc=new Scanner(System.in);
    	  List<String> list = new ArrayList<>();
    	  System.out.println("Enter the number of elements in the list:");
    	  int n=sc.nextInt();
    	  System.out.println("Enter the elements in the list:");
    	  for(int i=0;i<n;i++) {
    		  list.add(sc.next());
    	  }
    	  System.out.println("The list is "+list);
	        List<String> filtered = list.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
	        List<String> l=new ArrayList();
	        for(String str : filtered) {
	        	if(str.charAt(0)=='a' && str.length()==3) {
	        		l.add(str);
	        	}
	        }
	        if(l.size()!=0)
	        System.out.println("The list of elements starting with 'a' and having length as 3 is: "+l);
	        else
	            System .out.println("There are no elements starting with 'a' and having length as 3");
    }
}
