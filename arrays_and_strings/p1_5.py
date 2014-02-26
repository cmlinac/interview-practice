# given a string of repeating characters, compress it
# example: aaabbbccc -> a3b3c3

def compress_string(s) :
	result = ''
	last = s[0]
	count = 0
	for c in s :
		if c == last :
			count += 1
		else :
			result += last + str(count)
			last = c
			count = 1
	result += last + str(count)
	return result

