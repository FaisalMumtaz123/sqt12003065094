/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Faisal
 */
public class ProjectTest {
    
    public ProjectTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sort method, of class Project.
     */
    @Test
    public void testSort() {
        System.out.println("sort");
        int[] arr = null;
        heap prj4=new heap();
        prj4.sort(arr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of heapify method, of class Project.
     */
    @Test
    public void testHeapify() {
        System.out.println("heapify");
        int[] arr = null;
        heap prj3=new heap();
        prj3.heapify(arr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of maxheap method, of class Project.
     */
    @Test
    public void testMaxheap() {
        System.out.println("maxheap");
        int[] arr = null;
        int i = 0;
        heap prj2=new heap();
        
        prj2.maxheap(arr, i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of swap method, of class Project.
     */
    @Test
    public void testSwap() {
        heap prj0=new heap();
        System.out.println("swap");
        int[] arr = null;
        int i = 0;
        int j = 0;
        prj0.swap(arr, i, j);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Project.
     */
    
    @Test
    public void testcheckempty() {
	heap prj=new heap();	
        int[] arr = {};
		prj.sort(arr);
		assertEquals(0, arr.length);
 fail("The test case is a prototype.");	
    }
    @Test
    public void testsingleelement() {
		int[] arr = {1};
		heap prj1=new heap();
                prj1.sort(arr);
		assertEquals(1, arr.length);
		
     fail("The test case is a prototype.");
    }
@Test
public void testsort() {
		int[] arr = {7, 8, 5};
		heap prj5=new heap();
                prj5.sort(arr);
		assertEquals(3, arr.length);
		fail("the test case is prototype");
	}


}
