package com.bridgelabz.stack;
import java.util.*;

public class Main {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Operations:\n1.Push\n"
				+ "2.Pop\n"
				+ "3.Top\n"
				+ "4.Size\n"
				+ "5.IsEmpty\n"
				+ "6.Print stack\n"
				+ "Choose: ");
		stack<Integer> st = new stack<>();
		int choice = s.nextInt();
		while(choice!=-1)
		{
			if(choice==1)
			{
				System.out.print("Enter element :");
				int elem = s.nextInt();
				st.push(elem);
				System.out.println("Element pushed\n");
			}
			else if(choice==2)
			{
				 int poped =st.pop();
				 System.out.println("Element pushed = "+poped+"\n");
			}
			else if(choice==3)
			{
				int tp = st.top();
				System.out.println("Element at top = "+tp+"\n");
			}
			else if(choice==4)
			{
				int n = st.size();
				System.out.println("Size of stack = "+n+"\n");
			}
			else if(choice==5)
			{
				boolean isE = st.isEmpty();
				if(isE)
					System.out.println("Stack Empty\n");
				else
					System.out.println("Stack Not Empty\n");
			}
			else
			{
				st.printStack();
			}
			
			System.out.print("Enter choice : ");
			choice = s.nextInt();
		}
	}

}
