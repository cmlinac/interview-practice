import java.util.*; 

class p2_1 {
	/* Daniel Robertson */ 
	public static LinkedList<Integer> remove_duplicates(LinkedList<Integer> list) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(list.size()); 
		for(int i = 0; i < list.size(); ++i) {
			map.put(list.get(i), 1);
		}
		System.out.println(map.toString());
		return list; 
	}

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>(); 
		list.add(1); 
		list.add(2);
		list.add(3); 
		list.add(1); 
		list.add(2); 
		list.add(5); 
		System.out.println(remove_duplicates(list)); 
	}
}