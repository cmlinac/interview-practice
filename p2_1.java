import java.util.*; 

class p2_1 {
	/* Daniel Robertson */ 
	public static LinkedList<Integer> remove_duplicates(LinkedList<Integer> list) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); 
		LinkedList<Integer> result = new LinkedList<Integer>(); 

		for(Integer i: list) 
			map.put(i, new Integer(1)); 

		for(Integer i: map.keySet()) 
			result.add(i); 

		return result; 	
	}

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>(); 
		list.add(1); 
		list.add(2);
		list.add(3); 
		list.add(4);
		list.add(1); // dup
		list.add(2); // dup
		list.add(5); 
		System.out.println("before " + list); 
		System.out.println("after " + remove_duplicates(list)); 
	}
}