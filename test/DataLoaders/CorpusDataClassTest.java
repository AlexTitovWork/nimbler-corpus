package DataLoaders;

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
     * @throws java.lang.Exception
     */
    @Test
    public void testReadDataLemmaPosFormat() throws Exception {
        System.out.println("readDataLemmaPosFormat");
        CorpusDataClass instance = new CorpusDataClass("FiltredEntiresToDataBase.txt");
        instance.readDataLemmaPosFormat();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of readDataLemmaColl method, of class CorpusDataClass.
     */
//    @Test
//    public void testReadDataLemmaColl() throws Exception {
//        System.out.println("readDataLemmaColl");
//        CorpusDataClass instance = new CorpusDataClass();
//        instance.readDataLemmaColl();
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
     /**
     * Collect and writed product_category format model for nimbler to directory
     * Test of readDataLemmaColl method, of class CorpusDataClass.
     * @throws java.lang.Exception
     */
    @Test
    public void testreadDataProductToSetCategory() throws Exception {
        System.out.println("readDataProductToSetCategory");
        CorpusDataClass instance = new CorpusDataClass("FiltredEntiresToDataBase.txt");
        instance.readDataProductToSetCategory();
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("The test case is a prototype, ok! ");
    }
    
}
