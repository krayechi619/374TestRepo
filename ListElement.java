package Lab3;

public class ListElement {

    private ListElement next ;
    private ListElement previous ;
    private int data ;
   
    public ListElement ()
    {
        this . data = 0;
        this . next = null ;
        this . previous = null ;
    }
   
     public ListElement (ListElement nextValue, int data1, ListElement previousValue)
    {
        this . data = data1;
        this . next = nextValue;
        this . previous = previousValue;
    }
   
    public void setData ( int data)
    {
        this . data = data ;
    }
    public int getData ()
    {
        return this . data ;
    }
    public ListElement getNext()
    {
        return next;
    }
    public ListElement getPrevious()
    {
        return previous;
    }
    public void setNext(ListElement nextVal)
    {
        next = nextVal;
    }
    public void setPrevious(ListElement prevVal)
    {
        previous = prevVal;
    }
}