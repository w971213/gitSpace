package chapter9;

import java.time.LocalDate;
import java.util.PriorityQueue;

/**
 * 
 *@author fish fly
 *@version 1.8
 *@date 2019年7月22日
 *This program demonstrates the use of a priority queue. 
 */
public class PriorityQueue9_5 {
	public static void main(String[] args) {
		
		
		PriorityQueue<LocalDate> pq = new PriorityQueue<LocalDate>();
		pq.add(LocalDate.of(1906, 12, 9));
		pq.add(LocalDate.of(1815, 12, 10));
		pq.add(LocalDate.of(1903, 12, 3));
		
		System.out.println("Iterating over elements..."); 
		for (LocalDate l : pq) {
			System.out.println(l);
			System.out.println("Removing elements ");
			while(!pq.isEmpty()) {
				System.out.println(pq.remove());
			}
		}
		
		
		
		
		
	}
	
	
	
	
}
