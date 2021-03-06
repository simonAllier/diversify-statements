/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.iterators;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.NoSuchElementException;
import javax.imageio.metadata.IIOMetadataNode;
import org.apache.commons.collections4.iterators.NodeListIterator;
import org.junit.BeforeClass;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class NodeListIteratorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.iterators.NodeListIterator.remove()V: root-Branch
   * 2 org.apache.commons.collections4.iterators.NodeListIterator.<init>(Lorg/w3c/dom/Node;)V: I12 Branch 1 IFNONNULL L48 - true
   */

  @Test
  public void test0()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(575,"org.apache.commons.collections4.iterators.NodeListIteratorEvoSuiteTest.test0");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      NodeListIterator nodeListIterator0 = new NodeListIterator((Node) iIOMetadataNode0);
      // Undeclared exception!
      try {
        nodeListIterator0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // remove() method not supported for an NodeListIterator.
         //
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.iterators.NodeListIterator.<init>(Lorg/w3c/dom/Node;)V: I12 Branch 1 IFNONNULL L48 - false
   */

  @Test
  public void test1()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(576,"org.apache.commons.collections4.iterators.NodeListIteratorEvoSuiteTest.test1");
      NodeListIterator nodeListIterator0 = null;
      try {
        nodeListIterator0 = new NodeListIterator((Node) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // node must not be null!
         //
      }
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.iterators.NodeListIterator.<init>(Lorg/w3c/dom/NodeList;)V: I12 Branch 2 IFNONNULL L62 - false
   */

  @Test
  public void test2()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(577,"org.apache.commons.collections4.iterators.NodeListIteratorEvoSuiteTest.test2");
      NodeListIterator nodeListIterator0 = null;
      try {
        nodeListIterator0 = new NodeListIterator((NodeList) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // nodeList must not be null!
         //
      }
  }

  //Test case number: 3
  /*
   * 3 covered goals:
   * 1 org.apache.commons.collections4.iterators.NodeListIterator.hasNext()Z: I4 Branch 3 IFNONNULL L69 - true
   * 2 org.apache.commons.collections4.iterators.NodeListIterator.hasNext()Z: I13 Branch 4 IF_ICMPGE L69 - true
   * 3 org.apache.commons.collections4.iterators.NodeListIterator.<init>(Lorg/w3c/dom/Node;)V: I12 Branch 1 IFNONNULL L48 - true
   */

  @Test
  public void test3()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(578,"org.apache.commons.collections4.iterators.NodeListIteratorEvoSuiteTest.test3");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      NodeListIterator nodeListIterator0 = new NodeListIterator((Node) iIOMetadataNode0);
      boolean boolean0 = nodeListIterator0.hasNext();
      assertEquals(false, boolean0);
  }

  //Test case number: 4
  /*
   * 3 covered goals:
   * 1 org.apache.commons.collections4.iterators.NodeListIterator.hasNext()Z: I13 Branch 4 IF_ICMPGE L69 - false
   * 2 org.apache.commons.collections4.iterators.NodeListIterator.hasNext()Z: I4 Branch 3 IFNONNULL L69 - true
   * 3 org.apache.commons.collections4.iterators.NodeListIterator.<init>(Lorg/w3c/dom/NodeList;)V: I12 Branch 2 IFNONNULL L62 - true
   */

  @Test
  public void test4()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(579,"org.apache.commons.collections4.iterators.NodeListIteratorEvoSuiteTest.test4");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      iIOMetadataNode0.insertBefore((Node) iIOMetadataNode0, (Node) iIOMetadataNode0);
      NodeListIterator nodeListIterator0 = new NodeListIterator((NodeList) iIOMetadataNode0);
      boolean boolean0 = nodeListIterator0.hasNext();
      assertEquals(true, boolean0);
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.iterators.NodeListIterator.next()Lorg/w3c/dom/Node;: I4 Branch 5 IFNULL L73 - false
   * 2 org.apache.commons.collections4.iterators.NodeListIterator.next()Lorg/w3c/dom/Node;: I10 Branch 6 IF_ICMPGE L73 - true
   */

  @Test
  public void test5()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(580,"org.apache.commons.collections4.iterators.NodeListIteratorEvoSuiteTest.test5");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      NodeListIterator nodeListIterator0 = new NodeListIterator((NodeList) iIOMetadataNode0);
      // Undeclared exception!
      try {
        nodeListIterator0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // underlying nodeList has no more elements
         //
      }
  }

  //Test case number: 6
  /*
   * 3 covered goals:
   * 1 org.apache.commons.collections4.iterators.NodeListIterator.next()Lorg/w3c/dom/Node;: I10 Branch 6 IF_ICMPGE L73 - false
   * 2 org.apache.commons.collections4.iterators.NodeListIterator.next()Lorg/w3c/dom/Node;: I4 Branch 5 IFNULL L73 - false
   * 3 org.apache.commons.collections4.iterators.NodeListIterator.<init>(Lorg/w3c/dom/NodeList;)V: I12 Branch 2 IFNONNULL L62 - true
   */

  @Test
  public void test6()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(581,"org.apache.commons.collections4.iterators.NodeListIteratorEvoSuiteTest.test6");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      iIOMetadataNode0.insertBefore((Node) iIOMetadataNode0, (Node) iIOMetadataNode0);
      NodeListIterator nodeListIterator0 = new NodeListIterator((NodeList) iIOMetadataNode0);
      assertEquals(true, nodeListIterator0.hasNext());
      
      nodeListIterator0.next();
      assertEquals(false, nodeListIterator0.hasNext());
  }
}
