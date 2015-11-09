package mum;

import mum.stack.node;

public class printindex {

	 node head  ;
	    node item;
	    
  	printindex(){
  		
  		this.head= new node(null) ;
  	}

	public void push(String val){
		
		if(head==null){
        item = new node(null,val);
        head = item;}
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
	
	public String left(int x){
		
		
		while(x!=1){
			
			head= head.pointer;
			x--;
			
		}
		
		return head.value;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printindex st = new printindex();
        st.push("3");
        st.push("5");
        st.push("2");
        st.push("10");  
		//st.print();
//		st.pop();
//		
//		st.pop();
//		st.pop();
//		st.pop();
//		st.pop();
//		st.print();
//		
		System.out.println(st.left(1));
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
