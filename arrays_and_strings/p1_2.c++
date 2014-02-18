#include <stdio.h> 
#include <iostream> 
#include <string.h>
#include <cstring>
#include <algorithm>

/* Daniel Robertson */ 
void reverse_string(char *s) {
	using namespace std; 
	char tmp; 
	char* front = s; 
	char* back = s; 

	while(*back && *back != '\n') {
		++back;
	}
	--back;

	while (front != back) {
		tmp = *front; 
		*front = *back; 
		*back = tmp; 

		++front; 
		--back; 
	}
}

int main() 
{
	using namespace std; 

	/* 1.2 Reverse a string */ 
	char s[] = "hello";
	reverse_string(s); 
	cout << "reverse_string(\"hello\"): " << s << endl;  

	return 0; 
}

