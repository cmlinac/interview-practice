#include <stdio.h> 
#include <iostream> 
#include <string.h>
#include <cstring>
#include <algorithm>

char* get_array(std::string s) {
	char* s_arr = new char[s.size()]; 
	for(int i = 0; i < s.size(); ++i) {
		s_arr[i] = s[i]; 
	}
	return s_arr; 
}

bool is_equal(char *a, char *b) {
	if(strlen(a) != strlen(b))
		return false; 
	for(int i = 0; i < strlen(a); ++i) {
		if (a[i] != b[i]) 
			return false; 
	}
	return true; 
}

/* Daniel Robertson */ 
bool is_permutation(std::string a, std::string b) {
	if(a.size() != b.size())
		return false; 
	char* a_arr = get_array(a); 
	char* b_arr = get_array(b); 
	std::sort(a_arr, a_arr + strlen(a_arr)); 
	std::sort(b_arr, b_arr + strlen(b_arr)); 

	return is_equal(a_arr, b_arr);
}


int main() 
{
	using namespace std; 

	/* 1.3 Permutations */ 
	string a = "xyz"; 
	string b = "yzx"; 
	cout << "is_permutation(" << a << ", " << b << "): "; 
	std::cout.setf(std::ios::boolalpha);
	cout << is_permutation(a,b) << endl; 

	return 0; 
}

