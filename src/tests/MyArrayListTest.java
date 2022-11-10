/**
 * 
 */
package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import utilities.MyArrayList;

/**
 * @author zli
 *
 */
public class MyArrayListTest {

	/**
	 * @throws java.lang.Exception
	 */
//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//	}
//
//	/**
//	 * @throws java.lang.Exception
//	 */
//	@AfterClass
//	public static void tearDownAfterClass() throws Exception {
//	}
//
//	/**
//	 * @throws java.lang.Exception
//	 */
//	@Before
//	public void setUp() throws Exception {
//	}
//
//	/**
//	 * @throws java.lang.Exception
//	 */
//	@After
//	public void tearDown() throws Exception {
//	}

	
	@Test
	public void testAdd() {
		MyArrayList<Integer> arraylist = new MyArrayList<Integer>();
		arraylist.add(1, 2);
		assertEquals(true, arraylist.add(1, 2));
	}
	@Test
	public void testSecondAdd() {
		MyArrayList<Integer> arraylist = new MyArrayList<>();
		arraylist.add(1);
		
	}
	@Test
	public void testSize() {
		MyArrayList<Integer> arraylist = new MyArrayList<>();
		assertEquals(10, arraylist.size());
	}
	
	@Test
	public void testClear() {
		MyArrayList<Integer> arraylist = new MyArrayList<>();
		
	}
	
	@Test
	public void testAddAll() {
		
	}
	
	@Test
	public void testGet() {
		
	}
	
	@Test
	public void testRemove() {
		
	}
	
	@Test
	public void testSecondRemove() {
		
	}
	
	@Test
	public void testSet() {
		
	}
	
	@Test
	public void testIsEmpty() {
		
	}
	
	@Test
	public void testContains() {
		
	}
	
	@Test
	public void testToArray() {
		
	}
	
	@Test
	public void testSecondToArray() {
		
	}
	
	@Test
	public void testIterator() {
		
	}
	
	@Test
	public void testHasNext() {
		
	}
	@Test
	public void testNoSuchElementException() {
		
	}

}
