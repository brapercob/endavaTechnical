package tests;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class Endava {

	
	//list of numbers, 1 to 100, sorted or unsorted but unique, pick random but not stored
	//we should find what number is taking out from the list
	public static void main(String[] args) {
	
		
		
		
	}
	
	public int returnNumber(List<Integer> l) {
		
		List<Integer> list = new ArrayList<Integer>(l);
		int res = 0;
		list.remove(ThreadLocalRandom.current().nextInt(1, 100));
		
		for(Integer n: list) {
			if(n-list.get(list.indexOf(n)+1)>1) {
				res = n+1;
			}
			
		}
		return res;
		
	}
	
	
}
