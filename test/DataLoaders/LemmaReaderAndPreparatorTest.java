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
public class LemmaReaderAndPreparatorTest {
    
    public LemmaReaderAndPreparatorTest() {
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

}
