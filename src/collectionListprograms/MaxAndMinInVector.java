package collectionListprograms;

import java.util.Enumeration;
import java.util.Vector;

public class MaxAndMinInVector {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>();
		v.add(70);
		v.add(50);
		v.add(10);
		v.add(67);
		v.add(98);
		// int max=Collections.max(v);
		// int min=Collections.min(v);

		// System.out.println("The maximum and minimum value present in Vector is : " +
		// max+ " & min is: "+min);

		///// ooorrr/////

		int max = Integer.MIN_VALUE;
		Enumeration<Integer> e = v.elements();
		while (e.hasMoreElements()) {
			Integer num = e.nextElement();
			if (max < num) {
				max = num;
			}
		}
		System.out.println("The maximum value present in Vector is : " + max);

		int min = Integer.MAX_VALUE;
		Enumeration<Integer> emin = v.elements();
		while (emin.hasMoreElements()) {
			Integer num = emin.nextElement();
			if (min > num) {
				min = num;
			}
		}
		System.out.println("The maximum and minimum value present in Vector is : " + max + " & min is: " + min);
	}
}
