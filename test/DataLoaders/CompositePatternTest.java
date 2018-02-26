package DataLoaders;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import CategoryTreeStorage.CompositeElement;
import CategoryTreeStorage.CompositeClass;
import CategoryTreeStorage.CompositeParentElement;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Alex Titov 
 * @since 06.10.2017
 * alexeytitovwork@gmail.com
 */
public class CompositePatternTest {
    
    public CompositePatternTest() {
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
     * Test of getTagName method, of class CompositeClass.
     */
    @Test
    public void testGetTagName() {
        CompositeClass parentTag = new CompositeParentElement("<root>");
        parentTag. setStartTag("<root>");
      
       
        CompositeClass p1 = new CompositeParentElement("<food>");
        p1. setStartTag("<food>");
        parentTag. addChildTag(p1);
       
        CompositeClass child1 = new CompositeElement("<meat>");
        child1. setStartTag("<meat>");
      
        child1. setTagBody("<fruit>");
       
        p1. addChildTag(child1);
       
        child1 = new CompositeElement("<beef>");
        child1. setStartTag("<beef>");
     
        child1. setTagBody("<chicken>");
       
        p1. addChildTag(child1);
        parentTag.generateDataTree();

    }
    /**
     * Test of generateDataTree method, of class CompositeClass.
     */
    @Test
    public void testProductStreamLoad() {
              
        
        System.out.println("Get noun collection");
        CorpusDataClass instance = new CorpusDataClass("FiltredEntiresToDataBase.txt");
         List<String> sequence = instance.getNounCollection();
        
      
        
         sequence.stream().forEach((Element) -> {
             CompositeClass parentTag = new CompositeParentElement("<"+ Element + ">");
             parentTag. setStartTag("<"+ Element + ">");
        });
            
      
      
       
        CompositeClass parentTag = new CompositeParentElement("<food>");
        parentTag. setStartTag("<food>");
        parentTag.addChildTag(parentTag);
       
        CompositeClass child1 = new CompositeElement("<meat>");
        child1. setStartTag("<meat>");
      
        child1. setTagBody("<fruit>");
       
        parentTag. addChildTag(child1);
       
        child1 = new CompositeElement("<beef>");
        child1. setStartTag("<beef>");
     
        child1. setTagBody("<chicken>");
       
        parentTag. addChildTag(child1);
        parentTag.generateDataTree();

     
    }


    /**
     * Test of setStartTag method, of class CompositeClass.
     */
    @Test
    public void testSetStartTag() {
       
    }

    /**
     * Test of setEndTag method, of class CompositeClass.
     */
    @Test
    public void testSetEndTag() {
       
    }

    /**
     * Test of setTagBody method, of class CompositeClass.
     */
    @Test
    public void testSetTagBody() {
       
    }

    /**
     * Test of addChildTag method, of class CompositeClass.
     */
    @Test
    public void testAddChildTag() {
       
    }

    /**
     * Test of removeChildTag method, of class CompositeClass.
     */
    @Test
    public void testRemoveChildTag() {
       
    }

    /**
     * Test of getChildren method, of class CompositeClass.
     */
    @Test
    public void testGetChildren() {
       
    }

    /**
     * Test of generateDataTree method, of class CompositeClass.
     */
    @Test
    public void testGenerateDataTree() {
     
    }

    public class CompositeClassImpl extends CompositeClass {

        public String getTagName() {
            return "";
        }

        public void setStartTag(String tag) {
        }

        public void setEndTag(String tag) {
        }

        public void generateDataTree() {
        }
    }
    
}
