class p1_1 {
	/* Ver Starr */
	public static boolean isAllUniqueChar(String s) {
		if (s.length() > 256)
			return false;

		boolean[] char_set = new boolean[256];
		for (int i = 0; i < s.length(); i++) {
			int val = s.charAt(i);
			if (char_set[val])
				return false;
			char_set[val] = true;
		}
		return true; 
	}

    public static void main(String[] args) {
        String s = "thequickbrwnfxjmpsaa";
        if (isAllUniqueChar(s))
       		System.out.println("OK");
       	else
       		System.out.println("FAIL");
    }

}