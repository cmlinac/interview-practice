/* Daniel Robertson 
 * Amazon interview question: write a method that prints a tree in order 
 */ 

#include <stdio.h> 
#include <iostream>
#include "tree.h"

using namespace std; 

void print_pre_order(struct node* root) { 
	if(root == NULL) 
		return; 
	cout << root->value << " "; 
	if(root->left != NULL) 
		print_pre_order(root->left); 
	if(root->right != NULL) 
		print_pre_order(root->right); 
}

void print_in_order(struct node* root) { 
	if(root == NULL) 
		return; 
	if(root->left != NULL) 
		print_in_order(root->left); 
	cout << root->value << " "; 
	if(root->right != NULL) 
		print_in_order(root->right); 
}

void print_post_order(struct node* root) { 
	if(root == NULL) 
		return; 
	if(root->left != NULL) 
		print_post_order(root->left); 
	if(root->right != NULL) 
		print_post_order(root->right); 
	cout << root->value << " "; 
}

/* Driver */ 
int main() { 
	struct node root, A, B, C, D, E, F, G, 
		H, I, J, K, L, M, N, O, P; 
	
	A.value = 'a'; 
	B.value = 'b'; 
	C.value = 'c'; 
	D.value = 'd'; 
	E.value = 'e'; 
	F.value = 'f'; 
	G.value = 'g'; 
	
	A.left = &B; 
	A.right = &C; 

	B.left = &D; 
	B.right = &E; 

	C.left = &F; 
	C.right = &G; 

	D.left = NULL; 
	D.right = NULL; 

	E.left = NULL; 
	E.right = NULL; 

	F.left = NULL; 
	F.right = NULL; 

	G.left = NULL; 
	G.right = NULL; 

	/* The tree  is 
	 *
	 *       a
	 *     /   \
	 *   b      c
	 *  / \    /  \
	 * d   e  f    g
	 * 
	 * pre-order: a b d e c f g
	 * in-order: d b e a f c g
	 * post-order: d e b f g c a
	 */ 


	cout << "pre-order: "; 
	print_pre_order(&A); 
	cout << endl; 

	cout << "in-order: "; 
	print_in_order(&A); 
	cout << endl; 

	cout << "in-order: ";
	print_post_order(&A); 
	cout << endl;

	return 0; 
}