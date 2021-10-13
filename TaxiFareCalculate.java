package java_examples;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class TaxiFareCalculate {
	public static void main(String[] args) {
		String[] cities = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" };
		int[] distance = { 20, 40, 34, 76, 13, 87, 6, 23, 17, 0 };
		int[] price = { 2, 5, 2, 3, 6, 4, 2, 3, 5, 2 };
		String source = "C";
		String destination = "I";
		Map<String, Integer> map = new HashMap<>();
		for (int j = 0; j < cities.length; j++)
			map.put(cities[j], distance[j]);

		Map<String, Integer> cityAndPriceMap = new LinkedHashMap<>();
		for (int i = 0; i < distance.length; i++)
			cityAndPriceMap.put(cities[i], price[i]);

		int total_price = 0;
		total_price += (cityAndPriceMap.get(source) * 100);
		int city_index = 0;

		for (Map.Entry<String, Integer> values : map.entrySet()) {

			if (destination == values.getKey()) {
				break;
			}
			city_index++;
		}
		System.out.println(city_index);
		int counter = 0;
		int totaldistance = 0;
		String current_city = "";
		String previuos_city = "";
		int petrol_in_car = 100;

		for (Map.Entry<String, Integer> values : map.entrySet()) {
			previuos_city = current_city;
			current_city = values.getKey();
			if (counter == city_index) {
				break;
			}
			counter++;
			petrol_in_car = petrol_in_car - values.getValue();
			totaldistance += values.getValue();
			if (totaldistance >= 100) {
				System.out.println("The City To refill The Petrol: " + current_city);
				int petrol_price_in_current_city = cityAndPriceMap.get(current_city);
				petrol_in_car += 100;
				total_price += petrol_price_in_current_city * 100;
				totaldistance = values.getValue();
			}
		}
		System.out.println("Total Fare From " + source + " To " + destination + " is: " + total_price);
		System.out.println("Total Fare After Taking out Remaining Petrol: " + (total_price - petrol_in_car));
	}
}