class AllMethodsOfQueue{
	static int front=-1,rear=-1,temp;
	static int tempForEnque=0;
	static int array[]=new int[5];
	public static void enque(int n){
		if(rear==4){
			rear=0;
			if(rear==front){
				rear=5;
				System.out.println("Queue Overflow");
			}
			else{
				array[rear]=n;
			}
		}
		else{
			if(rear==-1)
				front=0;
			rear++;
			array[rear]=n;
		}
	}
	public static int deque(){
		if(rear==-1){
			System.out.println("Queue Underflow");
			return 0;
		}
		else{
			temp=front;
			front++;
			return array[temp];
		}
	}
	public static void display(){
		if(front>=rear){
			for(int j=front;j<5;j++){
				System.out.println("Queue element : "+array[j]);	
			}
			for(int k=0;k<=rear;k++){
				System.out.println("Queue element : "+array[k]);
			}
		}
		else{
			for(int i=front;i<=rear;i++){
				System.out.println("Queue element : "+array[i]);
				System.out.println("Loop");

			}
		}
		
	}
}
class CircularQueue{
	public static void main(String[] args) {
		AllMethodsOfQueue obj=new AllMethodsOfQueue();
		obj.enque(1);
		obj.enque(2);
		obj.enque(3);
		obj.enque(4);
		obj.enque(5);
		System.out.println("Deque 1st element is : "+obj.deque());
		obj.enque(6);
		System.out.println("Deque 2nd element is : "+obj.deque());
		obj.enque(7);
		System.out.println("Deque 2nd element is : "+obj.deque());
		obj.enque(8);

		obj.display();
	}
}