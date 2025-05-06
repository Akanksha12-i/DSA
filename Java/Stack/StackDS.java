

public class StackDS {
    
    private int[] a;
    private int max_size;
    private int top=-1;

    StackDS(int max_size){
     this.max_size=max_size;
     a=new int[max_size];
    }
    public void push(int x){
     if(top==max_size-1)
     System.out.println("Stack Overflow!!");
     else{
        top++;
        a[top]=x;
     }
    }
    public int pop(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        int x=a[top];
        top--;
        System.out.println(x +" is popped!!");
        return x;
    }

    public boolean isEmpty(){
        if(top==-1)
        return true;
        else 
        return false;
    }

    public void printStack(){
        if(top!=-1){
            System.out.println("________");
        for(int i=top;i>=0;i--){
           System.out.println("|__"+a[i]+"__|");
        }
    }else
    System.out.println("Stack is Empty!!");
    }

    public static void main(String[] args) {
        StackDS s=new StackDS(5);
        s.push(52);
        s.push(85);
        s.push(12);
        s.push(23);
        s.pop();
        System.out.println(s.isEmpty());
        s.printStack();

    }
}
