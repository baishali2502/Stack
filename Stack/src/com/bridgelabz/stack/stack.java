package com.bridgelabz.stack;



// @desc:Implementing stack using linked-list

public class stack<T> 
{
	Node<T> head;
	int size;
	stack()
	{
		head=null;
		size=0;
	}
	
//----------------------------------- UC-1 --------------------------------------
	
	/*
	 * @desc:This method returns the top element of the stack
	 * 
	 * @returns:the element at top
	 * 
	 * @params:none
	 */
	public T top()
	{
		if(size()==0)
			return null;
		else
		    return head.data;
	}

	/*
	 * @desc:This method adds an element in the stack
	 * 
	 * @params:New element to be added
	 * 
	 * @returns:void
	 */
	public void push(T elem)
	{
		Node<T> newnode = new Node<T>(elem);
		newnode.next = head;
		head = newnode;
		size++;
	}

}
