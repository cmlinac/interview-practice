class p1_4 {
	/* Ver Starr */
	public static void replace_Space(char[] str, int length) {
		int spaceCount = 0, newLength, i;
		for (i = 0; i < length; i++) {
			if (str[i] == ' ')
				spaceCount++;
		} 
		newLength = length + spaceCount * 2;
		System.out.println(str);
		System.out.println(newLength);
		str[newLength] = '\0';
		for (i = length -   1; i >= 0; i--) {
			if (str[i] == ' ') {
				str[newLength - 1] = '0';
				str[newLength - 2] = '2';
				str[newLength - 3] = '%';
				newLength = newLength - 3;
			}
			else {
				str[newLength - 1] = str[i];
				newLength = newLength - 1;
			}
		}
	}

    public static void main(String[] args) {
        char[] s = "We the people".toCharArray();
        replace_Space(s, s.length);
        //String out = new String(s);
        //System.out.println(out);
    }

}