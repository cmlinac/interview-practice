# remove all spaces from a string

def remove_spaces_simple(line) :
	return line.replace (' ', '%20')

def remove_spaces_comp(line) :
	return "%20".join([s for s in line if s != ' '])

def remove_spaces_split_join(line) :
	return "%20".join(line.split(" "))

'''
Java:
public static String removeSpaces(String s) {
	StringBuilder result = new StringBuilder(s);
	for (int i = 0; i < s.length(); i++) {
		char c = s.charAt(i);
		if (c != ' ') {
			result.append(c);
		}
		else {
			result.append("%20");
		}
	}
	return result.toString();
}
'''