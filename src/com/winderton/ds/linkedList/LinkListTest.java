package com.winderton.ds.linkedList;
class LinkListTest {
    public static void main(String[] args) {
    	
	    LinkedList list = new LinkedList();
	    
	    for (int i = 5; i >= 1; i --) {
	    	list.insert(i);
	    }
	    list.printList();


//	    while(!list.isEmpty()) {
//		    Node deletedLink = list.delete();
//		    System.out.print("deleted: ");
//		    deletedLink.printNode();
//		    System.out.println("");
//	    }
//	    System.out.println("List is empty");
    }
}