# How do you find the nth to last element in a linked list 
# on the first pass?
from LL import node
from LL import linked_list

# iterative solution
def from_end_i(list, n) :
	if list.first == None : return None

	starter = list.first
	lagger = list.first

	count = 1
	while (starter.next != None) :
		starter = starter.next
		if (count >= n) :
			lagger = lagger.next
		count += 1
	return lagger

# recursive solution
def from_end_r(list, n) :
	return find_from_end(list.first, n, [1])

def find_from_end (node, n, count) :
	# base case, reached the last node
	# set count and return
	if node.next == None :
		count[0] = 1
		return 
	nextNode = find_from_end(node.next, n, count) # TODO: can this be made tail recursive?
	count[0] += 1
	if count[0] == n :
		return node
	return nextNode
