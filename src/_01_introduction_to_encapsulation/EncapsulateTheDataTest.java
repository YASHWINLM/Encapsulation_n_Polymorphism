package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EncapsulateTheDataTest {

	@Test
	void testInt() {
		 EncapsulateTheData e= new EncapsulateTheData();
		 e.SetItemsRecieved(-5);
		 assertEquals(0,e.GetItemsRecived());
		  e.SetItemsRecieved(5);
		  assertEquals(5,e.GetItemsRecived());
		  
		  
		  e.SetDegreesTurned(-330);
		  assertEquals(-330,e.GetDegreesTurned());
		  e.SetDegreesTurned(330);
		  assertEquals(330,e.GetDegreesTurned());
		  
		  
		  e.SetNomenClature("");
		  assertEquals(" ",e.GetNomenClature());
		  e.SetNomenClature("hi");
		  assertEquals("hi",e.GetNomenClature());
		  
		  
		  e.SetMemberObj("s");
		  assertFalse(e.GetMemberObj() instanceof String);
		  e.SetMemberObj(1);
		  assertEquals(1,e.GetMemberObj());
		 
		 
		
	}

}
