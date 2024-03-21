package JavaPrac1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Prac444 {


	public static void main(String[] args) {

	Integer[] a= {22,44,66,77};
	
	List<Integer> al= new ArrayList<Integer>(Arrays.asList(a));
	Collections.reverse(al);
	
	Integer[] result= al.toArray(new Integer[0]);
	
	System.out.println(Arrays.toString(result));
	

	}
}
