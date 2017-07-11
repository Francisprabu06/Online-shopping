package com.examples.tutorials;
		
import java.util.*;

public class Workout{
	public static void main(String[] args){
	
	List<Integer>list = new ArrayList<Integer>();
	list.add(3);
	list.add(5);
	Collections.addAll(list,6,2,8,3,2,9);
	System.out.println("Before Collection sorting :" +list);
	Collections.sort(list);
	System.out.println(list);	
	Collections.reverse(list);
	System.out.println("Descending order :"+list);
	System.out.println("Even Numbers:8 6 2 2 ");
		
	}





}
