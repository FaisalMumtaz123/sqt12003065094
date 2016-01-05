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
        Project.sort(arr);
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
        Project.heapify(arr);
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
        Project.maxheap(arr, i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of swap method, of class Project.
     */
    @Test
    public void testSwap() {
        System.out.println("swap");
        int[] arr = null;
        int i = 0;
        int j = 0;
        Project.swap(arr, i, j);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Project.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Project.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
