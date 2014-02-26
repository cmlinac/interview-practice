# reverse the words in a string while preserving the word order and spacing
def reverse_words (s) :
	return " ".join([w[::-1] for w in s.split()])
