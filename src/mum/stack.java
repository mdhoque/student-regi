package mum;

public class stack {

	    node head  ;
	    node item;
	    
     	stack(){
     		
     		this.head= new node(null) ;
     	}

	public void push(String val){
		
		if(head==null){
           item = new node(null,val);   
           head=item;}
		else {
			item = new node(head,val);
		    head=item;
		}
			}
	
	
	public void pop(){
		
		if(head.pointer==null){
			
			System.out.println("not possible");
		}
		else 
		head = head.pointer;
		
	}
	
	
	public void print(){
		
		
		node temp;
		temp=head;
		while(temp!=null){
			
			System.out.println(temp.value);
			temp= temp.pointer;
			
		}
		
	}
	
public String left(int x){
		
		
		while(x!=1){
			
			head= head.pointer;
			x--;
			
		}
		
		if(head.pointer==null){
			System.out.println("You already reached head and not possible");
		    return null;}
		    else 
		    	return "Value is: "+head.value;
	}
	
	public static void main(String[] args) {
		
		stack st = new stack();
        System.out.println("Push:");
        st.push("3");
        st.push("5");
        st.push("2");
        st.push("10");  
		st.print();
        System.out.println("POP:");

		st.pop();
		
        System.out.println("Push:");

		st.push("231");
		
		
		st.print();
        System.out.println("Printing from left: ");

		System.out.println(st.left(2));
		
	}

	
	public class node{
		
		node pointer;
		String value;
		
		node(node pointer, String val){
			
			this.pointer= pointer;
			this.value=val;
			
		}
		
		node(node pointer)
		{this.pointer= pointer;}
	}
	
}
