package com.AverageList;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class App 
{
    public static void main( String[] args )
    {
    	        Scanner sc = new Scanner(System.in);
    	        List<Integer> list = new ArrayList<>();
    	        System.out.println("Enter the number of elements in the list:");
                int n=sc.nextInt();
                System.out.println("Enter the elements in the list:");
    	        list = IntStream.range(0,n).map(i -> sc.nextInt()).boxed().collect(Collectors.toList());
    	        System.out.println("The list is "+list);
    	  IntSummaryStatistics stats = list.stream()
    	                                     .mapToInt((x) -> x)
    	                                     .summaryStatistics();
    	  System.out.println("The average of the elements in the list is "+stats.getAverage());
    }
}
