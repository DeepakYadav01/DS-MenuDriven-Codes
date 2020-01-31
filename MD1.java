package QueuePrtc;

import java.util.Scanner;

public class MenudrivenQueue {


	static Node front;
	static Node rear;

	MenudrivenQueue ()
       {
    	   front=null;
       }
		static class Node
		{
		int data;
		Node next;
		Node(int d)
		{
		data=d;
		next=null;
		}
		}
		public void enqueue(MenudrivenQueue  p,int d )
		{
			Node n=new Node(d);
			n.next=null;
		if(p.front==null) {
			p.front=n;
			p.rear=n;
		}
		else
		{
          while(rear.next!=null)
          {
        	  rear=rear.next;
          }
			rear.next=n;
		}
		}
		public void dequeue(MenudrivenQueue  p)
		{


			if(front==null)
				System.out.println("queue is empty");
		else
		{
			 System.out.print("elements dequeued is \n");

        	  System.out.println(front.data);
        	  front=front.next;
		}
		}

		public void display(MenudrivenQueue  p)
		{
		         Node n=p.front;

			if(n==null)
				System.out.println("queue is empty");
		else
		{
			 System.out.print("elements present in queue are \n");

        	  while(n!=null)
        	  {
        		  System.out.println(n.data);
        		  n=n.next;
        	  }
		}
		}



		public static void main(String[] args)
		{
			MenudrivenQueue  q = new MenudrivenQueue ();


		Scanner s=new Scanner(System.in);
		char st='y';

		while(st=='y'||st=='Y') {
			System.out.println("1.Do you want to enqueue the element ");
			System.out.println("2.Do you want to dequeue the element ");
			System.out.println("3.Do you want to display the elements in the stack");

			int x=s.nextInt();

			switch(x)
			{
			case 1:
				System.out.println("Enter the element which you want to enqueue ");
				int d=s.nextInt();
				q.enqueue(q,d);
				break;

			case 2:
				q.dequeue(q);
				break;

			case 3:
				q.display(q);
				break;
		      default:
				System.out.println("Enter a valid no.");
				break;
			}
			System.out.println("\nDo you want to cotinue: yes/no");
			st=s.next().charAt(0);
			if(st=='y'||st=='Y')
				st='y';
				else if(st=='n'||st=='N')
				{
					st='n';
					break;
				}
				else
				{
					System.out.println("You have to enter either yes or no");
					System.out.println("\nDo you want to cotinue: yes/no");
					st=s.next().charAt(0);
				}
			}
		}
}
