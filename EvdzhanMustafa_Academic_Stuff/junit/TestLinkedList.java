package mustafa.evdzhan.junit;
import static org.junit.Assert.assertEquals;
import mustafa.evdzhan.AbstractDataTypes.LinkedList;

import org.junit.Before;
 
public class TestLinkedList {

	LinkedList ll= new LinkedList();
	LinkedList ll2= new LinkedList();
	@Before 
	public void setUp(){
	ll.addToFront("two");
	ll.addToFront("one");
	ll.addToBack("three");
	ll.addToBack("four");
	}
	@Before
	public void setUp2(){
		for(int i = 1;i <= 50; i++) {
		ll2.addToBack(i);
		}
		 
	}
	@org.junit.Test
	public void test() {
	    	assertEquals(ll.getFront().toString(),"one");
		    assertEquals(ll.getBack().toString(),"four");
		    assertEquals(ll.getSize(),4);
	}
   @org.junit.Test
	public void test2() {
		for(int i=1;i<=50;i++) {
			assertEquals(ll2.getFront().getData(),i);
			ll2.removeFromFront();
		}
	}
}
