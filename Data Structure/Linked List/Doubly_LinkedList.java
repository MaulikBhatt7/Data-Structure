import java.util.Scanner;
class List{
	Node head=null,tail=null;
	static class Node{
		int data;
		Node next;
		Node prev;
			public Node(int data){
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	public void insertLast(int m){
		Node mNode = new Node(m);
		if(head==null){
			head=mNode;
			tail=mNode;
		}
		else{
			tail.next=mNode;
			mNode.prev=tail;
			tail=mNode;
		}
	}

	public void delete(int d){
		Node tempNext=null,tempPrev=null,temp;
		temp=tail;
		tempPrev=temp.prev;
		if(head.data==d){
			head=head.next;
			head.prev=null;
		}
		else if(tail.data==d){
			tail=tail.prev;
			tail.next=null;
		}
		else{
			while(tempPrev!=null){
				if(temp.data==d){
					tempPrev.next=tempNext;
					tempNext.prev=tempPrev;
				}
				temp=temp.prev;
				tempNext=temp.next;
				tempPrev=temp.prev;
			}
		}
	}
	public void display(){
		head=tail;
		System.out.print("Linked List : ");
		while(head.prev!=null){
			System.out.print(" "+head.data+" <=");
			head=head.prev;
		}
		System.out.print(" "+head.data);
	}
}
class Doubly_LinkedList{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List obj = new List();
		System.out.print("Enter no. of element of Linked List : ");
		int l=sc.nextInt();
		for(int i=0;i<l;i++){
			System.out.print("Enter element of Linked List : ");
			obj.insert(sc.nextInt());
		}
		obj.display();
		obj.delete(1);
		System.out.println("\n");
		obj.display();
	}
}