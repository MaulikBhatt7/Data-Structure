class Method_Implement_Demo{
	int a[]=new int[100];
	int flag=-1
	public void push(int n){
		if(top>=10){
			System.out.println("Stack Overflow");
		}
		else{
			a[++top]=n;
		}
	}
	public int pop(){
		if(top<0){
			System.out.println("Stack Underflow");
		}
		else{
			return a[top--];
		}
	}
	public int peek(){
		if(top<0){
			System.out.println("Stack Underflow");
		}
		else{
			return a[top];
		}
	}
	public int peep(int i){
		if(top-i+1<0){
			System.out.println("Stack Underflow");
		}
		else{
			return a[top-i+1];
		}
	}
	public void change(int i,int n){
		if(top-i+1<0){
			System.out.println("Stack Underflow");
		}
		else{
			a[top-i+1]=n;
		}
	}
	public void display(){
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}
class Method_Implement_{
	public static void main(String[] args) {
		Method_Implement_Demo mid=new Method_Implement_Demo();
		mid.push(5);
		mid.pop();
		mid.peek();
		mid.peep(1);
		mid.change(1,2);
		mid.display;
	}
}


