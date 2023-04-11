package eeee;

import java.util.ArrayList;
import java.util.HashMap;


public class Array1 {
	public static void main (String[] args) {
		ArrayList<String>li=new ArrayList<String>();
		li.add("ankita");
		li.add("ayush");
		li.add("rohit");
		li.add("ankita");
		li.add("shivani");
		li.add("ashish");
		HashMap<String,Integer>map=new HashMap<>();
		
		for(String ab:li) {
			
	int c=0;
	for(String ab1:li)
	{
	if(ab.equals(ab1)) {
		c++;
		map.put(ab1, c);
	}
	
	}
		}
		System.out.println(map);
}
}