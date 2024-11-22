//Q2 : stack with operation

public class Stack{ 
    int[] stack;
    int capacity;
    int top;

    public Stack(int size) {
    capacity=size;
    stack=new int[capacity];
     top=-1;
    }

    public void push(int value){
    if(top==capacity-1){System.out.println("Empty");}
    stack[++top]=value;
    System.out.println("Pushed"+ " "+value);
    }

    public void pop(){
    if(top==-1){
    System.out.println("Empty");
    }
    int element= stack[top--];
    System.out.println("Element"+element+"Popped");
    }

    public void display(){
    if(top==-1){
    System.out.println("Empty");
    }
    for(int i=top;i>=0;i--){
    System.out.println(stack[i]);
    }
    }
   public static void main(String[] args) {
     Stack stack= new Stack(3);
     stack.push(1);
     stack.push(2);
     stack.push(3);
     stack.display();
     stack.pop();
     stack.pop();
     stack.display();
     stack.pop();
     stack.pop();
   }
    
}