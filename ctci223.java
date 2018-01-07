import java.util.*;

class Example223 {

    public static void main (String [] args){
	
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

	n1.print();
	n1.removeNode(n7);
	n1.print();
	
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

	n10.print();
	n10.removeNode(n16);
	n10.print();
    }
}


class Node{

    int data;
    Node next;
    
    public Node(int data){
	this.data = data;
	next = null;
    }

    void add(Node n){       
	Node head = this;

	while(head.next!=null){
	    head = head.next;
	}
	head.next = n;	
    }

    void removeNode(Node n){
	Node head = this;
	Node next = head.next;
	
	while(head.next!=null && next!=null){

	    if(next == n){
		head.next = next.next;
		System.out.println(next.data + " is removed");
	    }
	    
	    head = head.next;
	    next = head.next;
	    
	}
    }

    void print(){
	Node head = this;
	
	while(head.next!=null){
	    System.out.print(head.data + " ");
	    head = head.next;
	}

	System.out.println();
    }
}
 
