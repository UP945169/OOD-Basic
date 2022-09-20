package com.fdmgroup.loops;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) {
		double[] prices = {1.5,2.6,3,4.9};

		for (double price:prices) {
			System.out.println(price);
		}


		List<Double> Listprices = new ArrayList<Double>();
		Listprices.add(10.0);
		Listprices.add(5.70);
		Listprices.add(5.60);

		for (double Listprice:Listprices) {
			System.out.println(Listprice);
		}

	}

}
