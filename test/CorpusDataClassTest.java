/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class CorpusDataClassTest {
    
    public CorpusDataClassTest() {
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
     * Test of readDataLemmaPosFormat method, of class CorpusDataClass.
     */
    @Test
    public void testReadDataLemmaPosFormat() throws Exception {
        System.out.println("read Data Lemma Position Format");
        CorpusDataClass instance = new CorpusDataClass();
        instance.readDataLemmaPosFormat();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of readDataLemmaColl method, of class CorpusDataClass.
     */
    @Test
    public void testReadDataLemmaColl() throws Exception {
        System.out.println("readDataLemmaColl");
        CorpusDataClass instance = new CorpusDataClass();
        instance.readDataLemmaColl();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     /**
     * Test of readDataLemmaColl method, of class CorpusDataClass.
     */
    @Test
    public void testreadDataProductToSetCategory() throws Exception {
        System.out.println("readDataProductToSetCategory");
        CorpusDataClass instance = new CorpusDataClass();
        instance.readDataProductToSetCategory();
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("The test case is a prototype, ok! ");
    }
    
}
