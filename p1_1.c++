#include <stdio.h> 
#include <iostream> 
#include <string.h>

/* Daniel Robertson */ 
bool isAllUniqueCharacters(std::string s) {
	int characters[256] = {}; 
	for(int i = 0; i < s.size(); i++) {
		characters[s[i]]++; 
		if(characters[s[i]] >= 2) {
			std::cout << s[i] << std::endl; 
			return false; 
		}
	}
	return true;
}

int main() {
	using namespace std; 
	string s = "thequickbrwnfxjmps"; 
	cout.setf(ios::boolalpha);
	cout << isAllUniqueCharacters(s) << endl; 
}

