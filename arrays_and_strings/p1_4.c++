#include <stdio.h> 
#include <iostream> 
#include <string.h>
#include <cstring>
#include <algorithm>

/* Daniel Robertson */ 
std::string replace_spaces(std::string s) {
	using namespace std;
	string r = "";
	for (int i = 0; i < s.size(); ++i) {
		if (s[i] == ' ') 
			r += string("%20"); 
		else			
		 	r += s[i];
	}
	return r; 
}

int main() 
{
	using namespace std; 

	/* 1.4 Replace spaces wtih %20 */ 
	std::string a = "here is a sentence"; 
	cout << "replace_spaces(\"" << a << "\"): " << replace_spaces(a) << endl; 

	return 0; 
}

