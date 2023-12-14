package com.bridgelabz.stack;

import com.bridgelabz.datastructure.Node;

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
	
	//----------------------------------- UC-2 --------------------------------------
	
	/*
	 * @desc:This method pops an element from the stack
	 * 
	 * @params:none
	 * 
	 * @returns:The popped element
	 */
	public T pop()
	{
		if(size()==0)
			return null;
		T temp = head.data;
		head = head.next;
		size--;
		return temp;
	}
	
	/*
	 * @desc:This method prints the stack
	 * 
	 * @params:none
	 * 
	 * @returns:void
	 */	
	public void printStack() {
		if(isEmpty())
		{
			System.out.println("Stack Empty\n");
			return;
		}
		System.out.print("Top-->");
		Node<T> temp = head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			System.out.print("      ");
			temp=temp.next;
		}
		System.out.println();
		
	}
	/*
	 * @params:This method returns size of linked-list
	 * 
	 * @returns:int
	 * 
	 * @params:void
	 */
	public int size()
	{
		return size;
	}

	/*
	 * @desc:This method checks if the linked-list is empty or not
	 * 
	 * @params:none
	 * 
	 * @returns:boolean
	 */
	public boolean isEmpty()
	{
		return (size()==0);
	}


}
