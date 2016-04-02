package com.winderton.ds.linkedList;


class LinkedList {
	
    private Node first;

    public LinkedList() {
	    first = null;
    }

    public boolean isEmpty() {
	    return first == null;
    }

    public void insert(int d) {
	    Node freshNode = new Node(d);
	    freshNode.nextNode = first;
	    first = freshNode;
    }
    

    public Node delete() {
	    Node temp = first;
	    first = first.nextNode;
	    return temp;
    }

    public void printList() {
	    Node currentNode = first;
	    System.out.print("List: ");
	    while(currentNode != null) {
		    currentNode.printNode();
		    currentNode = currentNode.nextNode;
	    }
	    System.out.println("");
    }
}  

