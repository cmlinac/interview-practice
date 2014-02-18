#include <stdio.h> 
#include <iostream> 
#include <string>
#include <sstream>

/* Daniel Robertson */ 
std::string compress(std::string s) {
	std::string r = ""; 
	int i = 0, j = 1; 

	for(i = 0; i < s.size() ; i++) {
		if(s[i] == s[i + 1])
			j++; 
		else {
			std::stringstream ss; 
			ss << j;
			r += s[i] + ss.str(); 
			j = 1;
		}
	}

	//return r; 
	return (r.size() >= s.size()) ? s : r; 
}

int main() {
	using namespace std; 
	string s = "aabcccccaaa"; 
	cout << "compress(\"" << s << "\"): " << compress(s) << endl; 
}