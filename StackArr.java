class StackArr { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX];
  
    boolean isEmpty() 
    { 
        return (top < 0); 
    } 
    StackArr() 
    { 
        top = -1; 
    } 
  
    boolean push(int x) 
    { 
        if (top >= (MAX - 1)) { 
            System.out.println("Stack Overflow"); 
            return false; 
        } 
        else { 
            a[++top] = x; 
            System.out.println(x + " pushed into stack"); 
            return true; 
        } 
    } 
  
    int pop() 
    { 
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        else { 
            int x = a[top--]; 
            return x; 
        } 
    } 
  
    int peek() 
    { 
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        else { 
            int x = a[top]; 
            return x; 
        } 
    } 
    public static void main(String[] args) throws Exception {
        StackArr s = new StackArr(); 
        s.push(10); 
        s.push(20); 
        s.push(30);

        System.out.println("Lay phan tu o dau ra khoi stack: "+s.pop());
        System.out.println("Phan tu o dau danh sach: " + s.peek());
    }
}
