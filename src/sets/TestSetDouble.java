package sets;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class TestSetDouble {

	public static void main(String[] args) {
		HashSet<Double> set = new HashSet<>();
		set.addAll(Arrays.asList(1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01));
		
		for (Double v : set) {
			System.out.println(v);
		}
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		double max = Integer.MIN_VALUE;
		
		for (double m : set) {
			 if (m > max) {
				 max = m;
			 }
		 }
		
		System.out.println(max);
		
		double min = Integer.MAX_VALUE;
		
		for (double mi : set) {
			 if (mi < min) {
				 min = mi;
			 }
		 }
		System.out.println(min);
		set.remove(min);
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		for (Double v : set) {
			System.out.println(v);
		}
	}
	

}
