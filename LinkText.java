package Lab3;

public class LinkText {

	   public static void main(String[] args) {
	        // TODO Auto-generated method stub
	       
	       
	        ListElement le = new ListElement();
	                LinkedList mylist = new LinkedList();
	        System.out.format("List added\n");

	        le.setData(0);
	        mylist.addElement(le);
	                le.setData(1);
	        mylist.addElement(le);
	                le.setData(2);
	        mylist.addElement(le);
	                le.setData(3);
	        mylist.addElement(le);
	                le.setData(4);
	        mylist.addElement(le);
	               
	                ListElement value = new ListElement();
	                value = mylist.getElement(3);
	                System.out.format("The value is: " + value.getData() + "\n");
	               
	                mylist.printLinkedListHead();
	                mylist.printLinkedListTail();
	                mylist.deleteElement(3);
	                mylist.printLinkedListHead();
	                mylist.printLinkedListTail();
	        System.out.format("The value is set to 5\n");
	        System.out.println(le.getData());
	    }

	}

