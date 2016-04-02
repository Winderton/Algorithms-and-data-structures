package com.winderton.ds.linkedList;
class Node {
	
    public int data;
    public Node nextNode;


    public Node(int d) {
	    this.data = d;
    }

    public void printNode() {
	    System.out.print("{" + data + "} ");
    }
}
