class p1_3 {
	/* Ver Starr */
	public static boolean permutation(String s, String t) {
		if (s.length() != t.length()) //Permutations have to be equal length
			return false;

		int[] letters = new int[256]; //Assume ASCII char set
		char[] s_array = s.toCharArray();
		for (char c : s_array) {
			letters[c]++;
		}

		for (int i = 0; i < t.length(); i++) {
			int c = (int) t.charAt(i);
			if (--letters[c] < 0) 
				return false;
		}

		return true; 
	}

    public static void main(String[] args) {
        String s = "eeveet";
        String t = "teevee";
        if (permutation(s, t))
       		System.out.println("OK");
       	else
       		System.out.println("FAIL");
    }

}