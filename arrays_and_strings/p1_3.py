# given two strings, decide if one is a permutaton of the other

def is_permutation (s1, s2) :
	# assuming whitespace matters
	# if they are different lengths, they 
	# cannot be anagrams
	if len(s1) != len (s2) :
		return False

	# for this example, case doesn't matter
	s1 = s1.lower()
	s2 = s2.lower()

	# zipped so both count arrays are built 
	# at the same time
	strings = zip(s1, s2)

	# assuming ascii
	count1 = [128]
	count2 = [128]
	

	for c, d in strings :
		count1[hash(ord(c))] += 1
		count2[hash(ord(d))] += 1
		# TODO: make cleaner. array sizes should be 128 
		# but I couldn't figure out how to get the ascii
		# value of c and d for indexing on the plane

	# compare the char counts
	counts = zip(count1, count2)
	for x, y in counts :
		if x != y :
			return False

	# char counts match
	return True

	

print is_permutation('hello', 'hasdf')