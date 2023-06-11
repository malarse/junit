package junits;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionsExample {
	
	@Test
	public void test1() {
		
	
	String str1 = "Selenium learn";
	String str2 = "Selenium learn";
	String str3 = "malar";
	
	Assertions.assertEquals(str1,str2);
	System.out.println("Strings are Equal");
	Assertions.assertNotEquals(str1, str3);
	System.out.println("Strings are not equal");
	
	String str4 = null;
	Assertions.assertNull(str4);
	System.out.println("Display null values");
	Assertions.assertNotNull(str1);
	System.out.println("disppalys not null values");

	String[] arr1 ={"abc" ,"xyz" ,"pqr"};
	String[] arr2 ={"abc" ,"xyz" ,"pqr"};
	Assertions.assertArrayEquals(arr1, arr2);
	System.out.println("Arrays are equal");
	
	
	int i =10;
	int j= 18;
	Assertions.assertTrue(j>i);
	Assertions.assertFalse(j<0);
	System.out.println("J is greater than I");
	
	
	ArrayList<String> list1 = new ArrayList<>();
	list1.add("Malar");
	list1.add("Mano");
	list1.add("Mani");
	
	Assertions.assertEquals(3, list1.size());
	System.out.println("List Sizes are equal");
	
	Assertions.assertFalse(list1.isEmpty());
	
	}
	

}
