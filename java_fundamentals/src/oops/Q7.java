package oops;
import java.util.*;

class Node{
	int data;
	Node next;
	Node(int data) {
		this.data=data;
		this.next=null;
	}
}
class Linkedlist{
	Node head;
	
	void AddFirst(int data) {
		Node newnode=new Node(data);

		newnode.next=head;
		head=newnode;
	}
	void AddLast(int data) {
		Node newnode=new Node(data);
		if(head==null) {
			head=newnode;
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newnode;
		
		
	}
	void Addarr(int[] arr) {
		for(int val:arr) {
			AddLast(val);
		}
	}
	void insert(int position, int data) {
		
	}
	void display() {
	Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("NULL");
	}
}
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linkedlist obj=new Linkedlist();
		//Node head=new Node(86);
		obj.AddFirst(10);
		obj.AddLast(90);
		obj.AddLast(394);
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		obj.Addarr(arr);
		obj.display();
		

	}

}
