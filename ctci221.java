import java.util.*;

class Example21{

    public static void main(String [] args){
	
	Node n1 = new Node(3);
	Node n2 = new Node(4);
	Node n3 = new Node(5);
	Node n4 = new Node(6);
	Node n5 = new Node(2);
	Node n6 = new Node(3);
	Node n7 = new Node(5);
	Node n8 = new Node(3);
	Node n9 = new Node(7);

	n1.add(n2);
	n1.add(n3);
	n1.add(n4);
	n1.add(n5);
	n1.add(n6);
	n1.add(n7);
	n1.add(n8);
	n1.add(n9);
	
	Node n10 = new Node(3);
	Node n11 = new Node(3);
	Node n12 = new Node(5);
	Node n13 = new Node(3);
	Node n14 = new Node(4);
	Node n15 = new Node(6);
	Node n16 = new Node(2);
       	Node n17 = new Node(7);
	Node n18 = new Node(6);
	Node n19 = new Node(9);
	Node n20 = new Node(3);
	
	n10.add(n11);
	n10.add(n12);
	n10.add(n13);
	n10.add(n14);
	n10.add(n15);
	n10.add(n16);
	n10.add(n17);
	n10.add(n18);
	n10.add(n19);
	n10.add(n20);
	
	n1.print();
	System.out.println("*****");
    
	n1.removeDuplicates();
	n1.print();
	
	System.out.println("*****");

	n10.print();

	System.out.println("*****");

       	Node nn = n10.removeDuplicatesNoBuffer();
       	nn.print();
    }
}

class Node {

    int data;
    Node next = null;

    public Node (int data){
	this.data = data;
    }

    public void add(Node node) {
	int data = node.data;
	Node newNode = new Node(data);
	Node head = this;
	
	while(head.next !=null){
	    head = head.next;	   
	}
	head.next = newNode;
    }

    public void print(){
	
	Node n = this;	
	if(n != null){
	    while(n.next != null){
		System.out.println(n.data);
		n = n.next;
	    }
	   
	    System.out.println(n.data);
	}
	
    }

    public void removeDuplicates(){
	Node head = this;
	Hashtable<Integer, Integer> table = new Hashtable<>();	
	Node n = head;

	if(n == null){
	}else{
	    table.put(n.data, 1);
	    
	    while(n.next != null){		
		int data = n.next.data;
		if(table.get(data) != null){
		    n.next = n.next.next;
		}else{
		    table.put(n.next.data, 1);
		    n = n.next;		
		}		
	    }
	
	}
    }

    public Node removeDuplicatesNoBuffer (){
	Node head = this;
	Node p1 = head;

	while(p1.next != null){
	    Node p2 = p1.next;
	    int p1Data = p1.data;
	    Node n = p1;
	    
	    while(p2 != null){
		Node temp = p2;

		if(p1Data == p2.data){		   		    
		    n.next = p2.next;
		}else{
		    n = n.next;
		    //n = p2
		    // n.next = temp;		    
		    //n.next = p2.next;
		    //  p1 = p1.next;
		}
		p2 = p2.next;		
	    }

	    p1 = p1.next;
	}

	return head;
    }
    
}