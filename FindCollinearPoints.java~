/* Jeremiah Bonney 
 * Daniel Robertson 
 */ 

import java.util.*;

class FindCollinearPoints {
	public static void main(String[] args) {

		int i, j, k; 
		double area; 
		Point p1 = new Point(1,1); 
		Point p2 = new Point(1,3); 
		Point p3 = new Point(2,2); 
		Point p4 = new Point(-1,-1); 
		Point p5 = new Point(3,2); 

		HashSet<HashSet<Point>> set = new HashSet<HashSet<Point>> (); 

		ArrayList<Point> list = new ArrayList<Point> ();  
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		
		for(i = 0; i < list.size(); i++) {
			for(j = 0; j < list.size(); j++) {
				if(i == j) 
					continue; 
				for(k = 0; k < list.size(); k++) {
					if(i == k || j == k) {
						continue; 
					}
					area = computeArea(list.get(i), list.get(j), list.get(k)); 
					if(area == 0) {
						HashSet<Point> temp = new HashSet<Point>(); 
						temp.add(list.get(i));
						temp.add(list.get(j));
						temp.add(list.get(k));	
						set.add(temp); 
					}
				}
			}
		} 
		printSet(set);
	}

	public static double computeArea(Point a, Point b, Point c) {
		double x =  (a.x * (b.y - c.y) - a.y * (b.x - c.x) + (b.x * c.y - b.y * c.x)) / 2.0;
		return x; 
	}

	public static void printSet(HashSet<HashSet<Point>> s) {
		for(HashSet<Point> a: s) {
			System.out.println(); 
			for(Point p: a) {
				System.out.println("Point (" + p.x + ", " + p.y + ")"); 
			}
		}
	}
}
