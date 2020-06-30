public class LinkedList
{
	
Node head;


public void add(int data)
{
 if(head==null)
    {
	this.head=new Node(data);
	
      }else
    	  
      {
    	 Node nodetoAdd=new Node(data);
    	 nodetoAdd.next=this.head;
    	 this.head=nodetoAdd;
      }
 



}

@Override
public String toString() { 
	return "["+head.data+","+head.next.data+"]";
}

public static void main(String args[])

{
	LinkedList list=new LinkedList();
	list.add(10);
	list.add(20);
	list.add(30);
	
	System.out.println(list);

}
	
   }
